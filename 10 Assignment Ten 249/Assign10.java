/*
 * Nicolas VonDollen
 * 12/7/2016
 * Assignment 10
 * 
 */
import java.util.*;
public class Assign10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int humanNum = 0;
		int orcNum = 0;
		
		System.out.println("Enter the number of Human troops: ");
		humanNum = keyboard.nextInt();
		System.out.println("Enter the number of Orc troops: ");
		orcNum = keyboard.nextInt();
		
		Army gondor = new Army("Gondor");
		for(int i = 0; i < humanNum; i++)
		{
			Human h = new Human();
			gondor.addSoldier(h);
		}
		Army mordor = new Army("Mordor");
		for(int i = 0; i < orcNum; i++){
			Orc o = new Orc();
			mordor.addSoldier(o);
		}
		
		
		int battleCnt = 0;
		while(!gondor.isDefeated() && !mordor.isDefeated())
			{
			System.out.println("BATTLE: " + battleCnt);
			gondor.attacks(mordor);
			mordor.attacks(gondor);
			
			System.out.println(gondor.toString());
			System.out.println(mordor.toString());
			
			battleCnt++;
			}
		System.out.println("Battles fought: " + battleCnt);
		if(gondor.isDefeated())
		{
			System.out.println(mordor.getName() + " is victorious!");
		}
		else if(mordor.isDefeated())
		{
			System.out.println(gondor.getName() + " is victorious!");
		}
		else
		{
			System.out.println("Both sides lost!");
		}
	}
	}

