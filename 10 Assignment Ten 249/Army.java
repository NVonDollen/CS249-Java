import java.util.*;
public class Army<E extends Unit>{

	ArrayList<E> soldiers = new ArrayList<>();
	String name = "";
	
	public Army(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name; 
	}
	
	public void addSoldier(E obj)
	{
		soldiers.add(obj);
	}
	
	public int getSoldierCount()
	{
		return soldiers.size();
	}
	
	public boolean isDefeated()
	{
		if(soldiers.isEmpty()==true){
			return true;
		}
		return false;
	}
	
	public void remove(E value)
	{
		soldiers.remove(value);
	}

	
	@Override
		
	public String toString()
	{
		String s = "";
		
		for(Unit z: soldiers){
			s += z.getHealth() + " ";
		}
		return this.getName() + ": " + s;
	}
	
	public <T extends Unit> void attacks(Army<T> other){
		ArrayList<E> deathToll = new ArrayList<>();
		
			for(int i = 0; i < this.getSoldierCount(); i++){
				
				//gen random soldier and attack that soldier
				int rand = (int)Math.random()*((other.getSoldierCount()-1)-0);
				Unit u = other.soldiers.get(rand);
				u.attack(soldiers.get(rand));
				
				//If the soldier dies, it is removed from the ArrayList
				if(u.isAlive()==false)
				{
					deathToll.add((E) u);
					other.remove((T) u); 
				}
				
				else
				{
					u.attack(soldiers.get(rand));
				}
				soldiers.removeAll(deathToll);
				if(other.isDefeated()==true)
				{
					break;
				}
			}
	}	
}