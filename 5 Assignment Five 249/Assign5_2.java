/*
 * Nick VonDollen
 * 10/23/16
 * Program to test the weapon and player classes.
 */
public class Assign5_2 {

	public static void main(String[] args) {
		Weapon sword = new Weapon("Common Sword", 50);
		Weapon coolSword = new Weapon("Glamdring, the Foe-Hammer", 1500);
		
		Player player = new Player(100,100);
		System.out.println(Weapon.printWeaponName(player.getCurrentWeapon()));
		player.setCurrentWeapon(sword.getWeaponName());
		System.out.println(Weapon.printWeaponName(player.getCurrentWeapon()));
		player.setCurrentWeapon(coolSword.getWeaponName());
		System.out.println(Weapon.printWeaponName(player.getCurrentWeapon()));

	}

}
