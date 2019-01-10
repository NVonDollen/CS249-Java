
public class Unit {
	private int attack = 0;
	private int health = 0;
	private boolean alive;
	private String name = "";
	
	public Unit(String newName, int newAttack, int newHealth)
	{
		alive = true;
		name = newName;
		attack = newAttack;
		health = newHealth;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public boolean isAlive()
	{
		return alive;
	}
	
	/////////////SETTERS////////////////
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setAttack(int newAttack)
	{
		attack = newAttack;
	}
	
	public void setHealth(int newHealth)
	{
		health = newHealth;
	}
	
	public void setAlive(boolean isAlive)
	{
		alive = isAlive;
	}
	
	public int attack(Unit other)
	{
		if(alive!=true || other.alive != true)
		{
			return 0;
		}
		int damage = (int)(Math.random()*((attack-1)));
		other.health = other.health-damage;
		health = health-damage;
		if(other.health<=0){
			other.health=0;
			other.alive=false;
		}
		if(health<=0)
		{
			health =0;
			alive = false;
		}
		
		return damage;
	}
	////////////////////////////////////////////
	@Override
	public String toString()
	{
		String message = "Name: " + name;
			
			return message;
	}
}
