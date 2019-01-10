/*
 * Nicolas VonDollen
 * 9/25/2016
 * Program to prompt the user to enter a phone number as a string to the console. After, the program will scan each element of the
 * string and send it to the method getNumber where each letter within the string will be converted into its respective number based on phone keypads.
 */
import java.util.*;
public class Assign3_4 {
	public static void main(String[] args) {
		String phoneNumber = "";
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user to enter a phone number as a string
		System.out.print("Enter a phone number as a string: ");
		phoneNumber = keyboard.nextLine();
		
		//Print out what the number translates to
		System.out.print(phoneNumber + " is translated to " );
		phoneNumber = phoneNumber.toUpperCase();
	
	//Traverse the phoneNumber for a letter and send each to the conversion method (getNumber)
	for(int i = 0; i<phoneNumber.length(); i++)
	{
		if(Character.isAlphabetic(phoneNumber.charAt(i)))
		{
			int convertedNumber = getNumber(phoneNumber.charAt(i));
			System.out.print(convertedNumber);
		}
		else
		{
			System.out.print(phoneNumber.charAt(i));
		}
	}
}
		public static int getNumber(char upperCaseLetter)
		/*Method to convert certain alphabetical letters to their respective phone pad numbers and return them.
		 * Nicolas VonDollen
		 * 9/25/16
		 */
		{
			int numberRelatedToLetter = 0;
			if(upperCaseLetter=='A' || upperCaseLetter=='B' || upperCaseLetter=='C')
			{
				numberRelatedToLetter = 2;
			}
			if(upperCaseLetter == 'D' || upperCaseLetter=='E' || upperCaseLetter=='F')
			{
				numberRelatedToLetter = 3;
			}
			if(upperCaseLetter == 'G' || upperCaseLetter == 'H' || upperCaseLetter == 'I')
			{
				numberRelatedToLetter = 4;
			}
			if(upperCaseLetter == 'J' || upperCaseLetter == 'K' || upperCaseLetter == 'L')
			{
				numberRelatedToLetter = 5;
			}
			if(upperCaseLetter == 'M' || upperCaseLetter == 'N' || upperCaseLetter == 'O')
			{
				numberRelatedToLetter = 6;
			}
			if(upperCaseLetter == 'P' || upperCaseLetter == 'Q' || upperCaseLetter == 'R' || upperCaseLetter == 'S')
			{
				numberRelatedToLetter = 7;
			}
			if(upperCaseLetter == 'T' || upperCaseLetter == 'U' || upperCaseLetter == 'V')
			{
				numberRelatedToLetter = 8;
			}
			if(upperCaseLetter == 'W' || upperCaseLetter == 'X' || upperCaseLetter == 'Y' || upperCaseLetter == 'Z')
			{
				numberRelatedToLetter = 9;
			}
		return numberRelatedToLetter;
		}
}
	
