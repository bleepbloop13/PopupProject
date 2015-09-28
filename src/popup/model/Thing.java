package popup.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	
	public Thing()
	{
		age = -99;
		weight = -.000000000005;
		name = "";
	}
	
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.weight = weight;
		this.name = name;
	}
}
