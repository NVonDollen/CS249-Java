/*
 * Nick VonDollen
 * 10/23/16
 * Program to run and test the functionality of the Circle2D class
 */
public class Assign5_1{		
	public static void main(String[] args) {
		Circle2D circle = new Circle2D(2,2,5.5); 	
			System.out.println("Area = " + circle.getArea());
			System.out.println("Perimeter = " + circle.getPerimeter());
			System.out.println("Contains(3,3)? " + circle.contains(3,3));
			System.out.println("Contains(4,5,10.5)? " + circle.contains(new Circle2D(4,5,10.5)));
			System.out.println("Overlaps Assign5_1(3,5,2.3)? " + circle.overlaps(new Circle2D(3,5,2.3)));		
	}
}
