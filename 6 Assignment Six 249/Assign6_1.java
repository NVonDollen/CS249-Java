import java.util.*;
/*
 * Nicolas VonDollen
 * 10/31/2016
 * Assign6_1
 */
public class Assign6_1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String itemName = "";
		int itemValue = 0;
		int itemWeight = 0;
		int itemDamage = 0;
		String isWeapon = "";
		Player player = new Player(3,3);
		
		do{
			System.out.println("Enter an item [name, weight, and value] in that order: ");
			itemName = keyboard.next();
			if(itemName.equalsIgnoreCase("none"))
				continue;
			itemWeight = keyboard.nextInt();
			itemValue = keyboard.nextInt();
			
			System.out.println("Is the item a weapon? [Y/N]");
			isWeapon = keyboard.next();
			if(isWeapon.equalsIgnoreCase("Y"))
			{
				System.out.println("What is the weapons damage? ");
				itemDamage = keyboard.nextInt();
				Weapon newWeapon = new Weapon(itemName, itemWeight, itemValue, itemDamage);
				player.addItem(newWeapon);
				
			}
			else
			{
				Item newItem = new Item(itemName, itemWeight, itemValue);
				player.addItem(newItem);
			}
					
		}while(!itemName.equalsIgnoreCase("none"));
		
		player.printInventory(player.inventory);
	}

}
