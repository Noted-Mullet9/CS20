package chapter7;

/*

Program: Circle.java          Last Date of this Revision: May 4, 2022

Purpose: Create a circle object

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class Circle {

  private static final double PT = 3.14;

  private double radius;

  public Circle(int radius) {

  }

  public void setRadius(double newRadius) {

    radius = newRadius;

  }

  public static void displayAreaFormula() {

    System.out.println("The formula for the area of a circle is a = Pi*r*r"); //outputs the formula for a circles area

  }

  public double area() {

    double circArea;

    circArea = PT * radius * radius; //calculates the circles area
    return (circArea); //returns the circles area

  }

  public double getRadius() {

    return (radius);

  }

  public double Circumference() {

    double circleCircumference;

    circleCircumference = (2 * 3.14 * radius);

    return circleCircumference;

  }

  public boolean equals(Object c) {

    Circle testObj = (Circle) c;

    if (testObj.getRadius() == radius) {

      return (true);

    } else {

      return (false);

    }

  }

  public String toString() {

    String circleString;

    circleString = "Circle has radius " + radius; //outputs the circles radius

    return (circleString);

  }

}