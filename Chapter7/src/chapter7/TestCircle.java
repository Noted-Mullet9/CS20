package chapter7;
/*

Program: TestCircle.java          Last Date of this Revision: May 5, 2022

Purpose: Test case for Circle

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class TestCircle {

  public static void main(String[] args) { //

    Circle spot = new Circle(5);

    spot.setRadius(3); //sets the circles radius

    System.out.println(" Circle radius: " + spot.getRadius()); //outputs the circles radius

    System.out.println("\n Circle circumference: " + spot.Circumference() + "\n"); //outputs the circles circumference

    Circle.displayAreaFormula(); //outputs the formula for a circles area

  }
}

/* Screen Dump

 Circle radius: 3.0

 Circle circumference: 18.84

The formula for the area of a circle is a = Pi*r*r

*/