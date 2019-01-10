
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
public class Player {
	private IntegerProperty xPos = new SimpleIntegerProperty(0);
	private IntegerProperty yPos = new SimpleIntegerProperty(0);
	private int health = 100;
	private String currentWeapon = null;
	//ArrayList<Item> inventory = new ArrayList<Item>();
	public Player(int newXPos, int newYPos)
	{
		xPos.setValue(newXPos);
		yPos.setValue(newYPos);
	}
	
//////////GETTER FUNCTIONS////////////
	public IntegerProperty getXCoord()
	{
		return xPos;
	}
	
	public IntegerProperty getYCoord()
	{
		return yPos;
	}
	
	public String getPosition()
	{
		return (xPos + "," + yPos);
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public String getCurrentWeapon()
	{
		return currentWeapon;
	}
	
	public IntegerProperty getXProperty()
	{
		return xPos;
	}
	
	public IntegerProperty getYProperty()
	{
		return yPos;
	}
	
	/*public void printInventory(ArrayList<Item> inventory)
	{
		for(int i = 0; i <inventory.size(); i++)
		{
			System.out.println("///////////////");
			System.out.println(inventory.get(i));
		}
		
	}*/
///////SETTER FUNCTIONS///////////
	public void setXCoord(int newXPos)
	{
		xPos.setValue(newXPos);
	}
	
	public void setYCoord(int newYPos)
	{
		yPos.setValue(newYPos);
	}
	
	public void setCoordinates(int newXPos, int newYPos)
	{
		xPos.setValue(newXPos);
		yPos.setValue(newYPos);
	}
	
	public void setHealth(int newHealth)
	{
		health = newHealth;
	}
	
	public void setCurrentWeapon(String newWeapon)
	{
		currentWeapon = newWeapon;
	}
	
/////////ARRAYLIST (inventory) FUNCTIONALITY////////
	/*public void addItem(Item newItem)
	{
		inventory.add(newItem);
	}
	
	public void removeItem(Item newItem)
	{
		inventory.remove(newItem);
	}*/
	
}
