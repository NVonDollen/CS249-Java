/* 
 * Nicolas VonDollen
 * 9/21/16
 * This is a program to print out the characters on the ASCII table from (! -> ~) 
 * and print out out 10 of them per line.
 */
public class Assign3_1 {

	public static void main(String[] args) {
	char asciiChar;
	int asciiInt;
	int linePrintCnt = 0;
		//Loop from 33-126 (ASCII (! -> ~))
		for(asciiInt= 33; asciiInt <=126; asciiInt++)
		{
			//Convert the integer value into its character value
			asciiChar = (char)asciiInt;
			System.out.print(asciiChar);
			System.out.print(" ");
			//Increment linePrintCnt to format to print 10 chars per line
			linePrintCnt++;
			//If linePrintCnt == 10, create a new line and reset linePrintCnt to 0.
			if(linePrintCnt == 10)
			{
				System.out.println("");
				linePrintCnt = 0;
			}
			
		}
	}

}
