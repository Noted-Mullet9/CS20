package chapter7;

/*

Program: Circle.java          Last Date of this Revision: May 4, 2022

Purpose: Critical thinking question #5 on pg. 70

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class Circle {
	
private static final double PT= 3.14;

private double radius;


public Circle (int radius) {
	
	


}

public void setRadius (double newRadius) {
	
	radius = newRadius; 
	
}


public static void displayAreaFormula() {
	
	System.out.println("The formula for the area of a circle is a = Pi*r*r");
	
}


public double area() {
	
	double circArea;
	
	circArea = PT * radius * radius; 
	return(circArea);

}

public double getRadius() {
	
	return(radius); 
	
}

public double Circumference() {
	
	double circleCircumference;
	
	circleCircumference = (2 * 3.14 * radius);
	
	return circleCircumference; 
	
}

public boolean equals(Object c) {
	
	 
	Circle testObj = (Circle)c; 
	
	if  (testObj.getRadius() == radius) {
		
		return(true);
		
	} else { 
		
		return (false); 
				
	}
	
}
	
	
	public String toString()  {
		
		String circleString; 
		
		circleString = "Circle has radius " +  radius; 
		
		return(circleString);
	
}

}

