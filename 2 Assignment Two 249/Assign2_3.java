/*
 * Nicolas VonDollen -- Assignment 2
 * 9/12/2016
 * Reads in an input sentence from the user and changes every found instance of "squirrel" to "...SQUIRREL!..." 
 * and then prints out the new string.
 * If the word "squirrel" isnt found, print out the original sentence and allow the program to end. 
 */
import java.util.*;
public class Assign2_3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String stringToFind = "squirrel";
        int squirrelLength = stringToFind.length(); //keeps track of the length of "squirrel" 
        	//System.out.println(squirrelLength);
        String replacementString = "...SQUIRREL!...";
        String newInputSentence = "";
        int indexVal = 0;
        int entireSentence = 0;
        boolean checkingForSquirrel = true;
        //Ask user to enter a string / sentence..
        System.out.print("Enter a sentence to be scanned for a keyword: ");
        String inputSentence = keyboard.nextLine();
        //loop through while program should still be "running" (til the end of the sentence is reached)
        while (checkingForSquirrel == true)
        {
        //See if "squirrel" is found in the inputSentence and save part of the sentence to a new string variable if there are any more words to be read from the sentence.
            if ((inputSentence.indexOf(stringToFind,indexVal) == -1) && entireSentence == 0)
            {
            	//if the word isnt found, print the original input sentence and break from the while loop by setting 
                System.out.println(inputSentence);
                checkingForSquirrel = false;
            }
            else if(inputSentence.indexOf(stringToFind,indexVal)!=-1)
            	{
            	    //parse original string into newInputSentence string.
                	newInputSentence += inputSentence.substring(indexVal,inputSentence.indexOf(stringToFind,indexVal)); 
                	//then add on "...SQUIRREL!..." to the new string.
                	newInputSentence += replacementString;	
                	//Change the index and add the length of "squirrel" 
                	indexVal = inputSentence.indexOf(stringToFind,indexVal);
                	indexVal += squirrelLength;
                	entireSentence++;
            	}
            	else
            	{
            		newInputSentence+= inputSentence.substring(indexVal);
            		checkingForSquirrel = false;
            	}
        	}
        //print out the new sentence with the changes made (if any are present).
        System.out.println(newInputSentence);
    }
}
