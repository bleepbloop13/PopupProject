package popup.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	/**
	 * Sets Thing to temporary information used before User input
	 */
	public Thing()
	{
		age = -99;
		weight = -.000000000005;
		name = "";
	}
	
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * Changes the information for the instance of Thing to user input'
	 * @param name	Name of the instance
	 * @param age	Age of the instance
	 * @param weight	Weight of the instance
	 */
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.weight = weight;
		this.name = name;
	}
	
	/**
	 * Returns the info from the user as a String
	 */
	public String toString()
	{
		String thingInfo = name + " is " + age + " and weighs " + weight + " pounds";
		return thingInfo;
	}
}
