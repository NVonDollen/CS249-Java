/* 
 * Nicolas VonDollen
 * 9/21/16
 */
import java.util.*;
public class Assign3_2 {
	
	public static void main(String[] args) {
		String input = "";
		int vowelCount = 0;
		int consonantCount = 0;
		int phrasePrice = 0;
		Scanner keyboard = new Scanner(System.in);
		//Ask user to input a string and print it.
		System.out.println("Enter a string: ");
		input = keyboard.nextLine();
		System.out.println(input);
		
		//Convert string to all upper or all lower-case.
		input = input.toLowerCase();
		
		//Calculate the number of vowels and consonants
		int index = 0;
		for(index = 0; index < input.length(); index++) //Searches each char in the string.
		{
			char vowelChar = input.charAt(index);
			if((vowelChar == 'a' || vowelChar == 'e' || vowelChar == 'i' || vowelChar == 'o' || vowelChar == 'u')) //if a,e,i,o,u are found in the string
			{
				vowelCount++; //Increment vowelCount.
			}	
			else if(Character.isAlphabetic(input.charAt(index)))
			{
				consonantCount++;
			}
		}
		//Calculate the price of the phrase (numVowels * 250)
		phrasePrice = (vowelCount * 250);
		
		//Print out number of vowels
		System.out.println("The number of vowels in the phrase is " + vowelCount);
		
		//Print out number of consonants
		System.out.println("The number of consonants in the phrase is " + consonantCount);
		
		//Print out price of phrase.
		System.out.println("The price of the phrase is $" + phrasePrice);
		}
}
//////////////////////////////////////////BELOW WAS AN ATTEMPT AT WRITING TWO SEPARATE METHODS FOR VOWELS AND CONSONANTS///////////////////////

//////////COUNT VOWELS METHOD/////////////////////
	/*public static int countVowelsAndConsonants(String input)
	{	
		int vowelCount = 0;
		int consonantCount = 0;
		int index = 0;
		for(index = 0; index < input.length(); index++) //Searches each char in the string.
		{
			char vowelChar = input.charAt(index);
			if((vowelChar == 'a' || vowelChar == 'e' || vowelChar == 'i' || vowelChar == 'o' || vowelChar == 'u')) //if a,e,i,o,u are found in the string
			{
				vowelCount++; //Increment vowelCount.
			}	
			else if(Character.isAlphabetic(input.charAt(index)))
			{
				consonantCount++;
			}
		}
		return vowelCount; 
	}
	
/////////////COUNT CONSONANTS METHOD//////////////////////
	public static int countConsonants(String input)
	//TODO
	{		
		boolean isItAlphabetic = false;
		int consonantCount = input.length();
		int index = 0;
		for(index = 0; index < input.length(); index++)
		{
			char consonantChar = input.charAt(index);
			//Check to see if the character being read at the index is part of the alphabet.
			isItAlphabetic = Character.isAlphabetic(input.charAt(index));
			System.out.println(isItAlphabetic);
			if((consonantChar == 'a' || consonantChar == 'e' || consonantChar == 'i' || consonantChar == 'o' || consonantChar == 'u') && isItAlphabetic == true)
			{
			
				consonantCount--;
			}		
			if(consonantChar == ' ')
			{
				consonantCount --;
			}
			
		}
		return consonantCount; 
		*/




