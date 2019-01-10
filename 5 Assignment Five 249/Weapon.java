public class Weapon {
	private String name;
	private int damage;
	
	public Weapon(String newName, int newDamage)
	{
		name = newName;
		damage = newDamage;
	}
	
	public String getWeaponName()
	{
		return name;
	}
	
	public int getWeaponDamage()
	{
		return damage;
	}
	
	public static String printWeaponName(String weaponName)
	{
		if(weaponName == null)
			return "No Weapon";
		else
			return weaponName;
	}
}

