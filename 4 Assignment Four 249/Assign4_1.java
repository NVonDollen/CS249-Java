import java.util.*;
public class Assign4_1 {
	public static void main(String[] args) 
{
		double [] eqnArray = new double [3];
	
		
		double EPS = 1e-14;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a value for A: ");
		eqnArray[0]=keyboard.nextDouble();
		System.out.println("Enter a value for B: ");
		eqnArray[1]=keyboard.nextDouble();
		System.out.println("Enter a value for C: ");
		eqnArray[2]=keyboard.nextDouble();
		
		double discriminant = (eqnArray[1]*eqnArray[1])-(4*(eqnArray[0])*(eqnArray[2]));
		eqnArray[2] = discriminant;
		
		solveQuadratic(eqnArray);
		
		if(Math.abs(discriminant) < EPS)
		{
			System.out.println("One root");
			System.out.println(eqnArray[0]);
		}
		else if(discriminant > 0)
		{
			System.out.println("Two Roots: " + eqnArray[0] + " " + eqnArray[1]);
		}
		else
		{
			System.out.println("No real roots");
		}
	}
	public static double [] solveQuadratic(double [] eqn)
	{
		double a = eqn[0];
		double b = eqn[1];
		eqn[0] = (-b + Math.sqrt(eqn[2])) / (2*a);
		eqn[1] = (-b - Math.sqrt(eqn[2])) / (2*a);
		return eqn;
	}
	
}