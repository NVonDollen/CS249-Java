/*
 * Nicolas VonDollen
 * 9/12/2016
 * Class to enter values for the lengths and number of sides of a polygon and calculate the area.
 */
import java.util.*;
public class Assign2_2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the area of a polygon calculator!");
		//Get value for number of sides
		System.out.println("Enter an integer value for the number of sides (n): ");
			int n = keyboard.nextInt();
		//Get value for lengths of sides
		System.out.println("Enter a numerical value for the lengths of the sides (s): ");
			double s = keyboard.nextDouble();
		//Print out area of the polygon.
		double area = (n*Math.pow(s,2))/(4*(Math.tan(Math.PI/n)));
			System.out.println(area);
	}

}
