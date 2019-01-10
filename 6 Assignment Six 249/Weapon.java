public class Weapon extends Item {
	private double damage;
	
	public Weapon(String newName, double newWeight, double newValue, double newDamage)
	{
		super.setName(newName);
		super.setWeight(newWeight);
		super.setValue(newValue);
		damage = newDamage;
	}
	
	public double getWeaponDamage()
	{
		return damage;
	}
	
	public void setWeaponDamage(double newDamage)
	{
		damage = newDamage;
	}
	
	@Override
	public String toString()
	{
		String message = super.toString();
		message += "\n" + "Damage: " + damage;
		return message;
	}
	
}

