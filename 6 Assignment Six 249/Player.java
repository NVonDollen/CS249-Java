import java.util.*;
public class Player {
	private int xPos;
	private int yPos;
	private int health = 100;
	private String currentWeapon = null;
	ArrayList<Item> inventory = new ArrayList<Item>();
	public Player(int newXPos, int newYPos)
	{
		xPos = newXPos;
		yPos = newYPos;
	}
	
//////////GETTER FUNCTIONS////////////
	public int getXCoord()
	{
		return xPos;
	}
	
	public int getYCoord()
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
	
	public void printInventory(ArrayList<Item> inventory)
	{
		for(int i = 0; i <inventory.size(); i++)
		{
			System.out.println("//////////////");
			System.out.println(inventory.get(i));
		}
		
	}
///////SETTER FUNCTIONS///////////
	public void setXCoord(int newXPos)
	{
		xPos = newXPos;
	}
	
	public void setYCoord(int newYPos)
	{
		yPos = newYPos;
	}
	
	public void setCoordinates(int newXPos, int newYPos)
	{
		xPos = newXPos;
		yPos = newYPos;
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
	public void addItem(Item newItem)
	{
		inventory.add(newItem);
	}
	
	public void removeItem(Item newItem)
	{
		inventory.remove(newItem);
	}
	
}
