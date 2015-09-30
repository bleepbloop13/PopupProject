package popup.controller;

import popup.model.Thing;
import popup.display.PopupDisplay;

public class PopupController
{
	private PopupDisplay myPopups;
	private Thing myThing;
	
	/**
	 * Instantiates a new instance of PopupDisplay
	 */
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	/**
	 * Runs on start. Collects input from the user with popups.
	 */
	public void start()
	{
		String name = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("You typed in " + name);
		
		int age;
		String tempAge = myPopups.getAnswer("Type in your age");
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswer("Type in an integer value !!!!!");
		}
		
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -12345678;
		}
		
		myPopups.displayResponse("You typed in " + age);
		
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your weight");
		
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswer("Give me a valid double value!");
		}
		
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		else
		{
			weight = -.9999990000001;
		}
		
		myPopups.displayResponse("You typed in " + weight);
		
		myThing = new Thing(name, age, weight);
		
		
	}
	
	/**
	 * Catches errors if user inputs a non integer when an integer is required.
	 * @param input :User input from the popups
	 * @return 
	 */
	private boolean isInteger(String input)
	{
		boolean isInteger = false;
		
		try
		{
			int validInt = Integer.parseInt(input);
			isInteger = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid integer :(");
		}
		
		return isInteger;
	}
	
	/**Catches errors if user inputs a non double value when a double is required.
	 * 
	 * @param input
	 * @return
	 */
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid double.");
		}
		
		return isDouble;
	}
}
