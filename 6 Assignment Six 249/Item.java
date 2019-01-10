public class Item {

	private String name;
	private double weight;
	private double value;
	
	public Item()
	{
		name = "";
		weight = 0;
		value = 0;
	}
	
	public Item(String newName, double newWeight, double newValue)
	{
		name = newName;
		weight = newWeight;
		value = newValue;
	}
	
///////////////GETTER FUNCTIONS///////////////////
	public String getName()
	{
		return name;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public double getValue()
	{
		return value;
	}
	///////////////SETTER FUNCTIONS///////////////////
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setWeight(double newWeight)
	{
		weight = newWeight;
	}
	
	public void setValue(double newValue)
	{
		value = newValue;
	}
	
	@Override
	public String toString()
	{
		String message = "Name: " + name + "\n";
		message +=  "Weight: " + weight + "\n";
		message += "Value: " + value;
		return message;
	}
	
}
