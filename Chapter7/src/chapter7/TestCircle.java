package chapter7;
/*

Program: AccoutnSetup.java          Last Date of this Revision: March 9, 2022

Purpose: Critical thinking question #5 on pg. 70

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class TestCircle {
	
	public static void main(String[] args) 
	{//
		
		Circle spot = new Circle(5); 
		
		spot.setRadius(3);
		
		System.out.println(" Circle radius: " + spot.getRadius());
		
		System.out.println("\n Circle circumference: " + spot.Circumference() + "\n");
		
		Circle.displayAreaFormula();

	}


	
	
}