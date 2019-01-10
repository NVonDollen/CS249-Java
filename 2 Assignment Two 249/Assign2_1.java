/* Nicolas VonDollen
 * 9/12/16
 * Class that checks for equality of the doubles input by the user.
 */
import java.util.Scanner;
public class Assign2_1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final double EPSILON = (1e-14);
		double denominator = 0;
		double a,b,c,d,e,f, x,y;
		System.out.println("Enter 6 number values for the variables A-F: ");
		a = keyboard.nextDouble();
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();
		d = keyboard.nextDouble();
		e = keyboard.nextDouble();
		f = keyboard.nextDouble();
		denominator = ((a*d)-(b*c));
		 	System.out.println("After calculations, your values for X and Y are as follows: ");
		 	if(Math.abs(denominator) < EPSILON)
		 	{
		 		System.out.println("No solution to be calculated.");
		 	}
		 	else
		 	{
		 		x = ((e*d)-(b*f)) / ((a*d)-(b*c));
		 		y = ((a*f)-(e*c)) / ((a*d)-(b*c));	
		 		System.out.println("X = " + x);
		 		System.out.println("Y = " + y);
		 	}
	}
}
