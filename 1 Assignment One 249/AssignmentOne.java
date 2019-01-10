/*
 *Nicolas VonDollen
 *CS 249 - Assignment 1
 * 9/8/16
 * This assignment / project contains two parts:
 * 1. Print out a simple message to the console
 * 2. Reads in 6 numbers and solves the "Cramer's Rule Equations" portion of the assignment for x and y.
 */
import java.util.Scanner;

public class AssignmentOne {
	//1 Hello World
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello World!!! (Haven't seen this line of code before!)");
		
////////////////////////////////////////////////////////////////////////////////////////
	//2 Cramer's Rule
		double a,b,c,d,e,f, x,y;
		System.out.println("Enter 6 number values for the variables A-F: ");
		a = keyboard.nextDouble();
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();
		d = keyboard.nextDouble();
		e = keyboard.nextDouble();
		f = keyboard.nextDouble();
		 	System.out.println("After calculations, your values for X and Y are as follows: ");
		
		x = ((e*d)-(b*f)) / ((a*d)-(b*c));
		y = ((a*f)-(e*c)) / ((a*d)-(b*c));
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
}
