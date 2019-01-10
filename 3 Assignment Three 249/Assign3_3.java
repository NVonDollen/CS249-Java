/*
 * Nicolas VonDollen
 * 9/25/2016
 * Program to print out a table of conversion between Feet and Meters, as well as Meters back to Feet
 * and print it out in a specific format with specific accuracies.
 */
public class Assign3_3 {
	public static void main(String[] args) {
		double foot = 0;
		double meter = 0;
		int j = 20;
		int i = 1;
		//Print table header
		printHeader();
		
		//Convert and print conversion first line - 10th line.
		for(i=1; i<=10; i++)
		{
			foot = i;
			//Print out Feet (Col 1, Line i)
			System.out.printf("%3.1f",(double)i);
			System.out.print("\t");
			
			//Print out Meters (Col 2, Line i)
			System.out.printf("%3.3f",footToMeter(foot));
			
			//Place | between Col's 2 and 3
			System.out.print("\t  |\t");
			
			//Print out Meters (Col 3, line i)
			meter = j;
			System.out.printf("%3.1f",(double)j);
			System.out.print("\t");
			
			//Print out Feet (Col 4, line i)
			System.out.printf("%3.3f",meterToFoot(meter));
			
			//Increment Meters (Col 3) by 5 each time.
			j+=5;
			
			//Print out a new line
			System.out.println("");	
		}
	}
	public static double footToMeter(double foot)
	/*
	 * Method to convert an input of feet to meters.
	 */
	{
	double feetToConvert = foot;
	double meterConversion = 0;
	
	meterConversion = 0.305 * feetToConvert;
		return meterConversion;
	}

	public static double meterToFoot(double meter)
	/*
	 * Method to convert an input of meters to feet.
	 */
	{	
	double metersToConvert = meter;
	double feetConversion = 0;
	
	feetConversion = 3.279 * metersToConvert;
		return feetConversion;
	}
	
	public static void printHeader()
	/*
	 * Method to print out the table header for 6.9
	 */
	{
	System.out.println("Feet\tMeters\t  |\tMeters\tFeet");
	//System.out.println("--------------------------------------");
		return;
	}

}