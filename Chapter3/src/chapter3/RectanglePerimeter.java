package chapter3;

/*

Program: RectanglePerimeter.java          Last Date of this Revision: September 30, 2019

Purpose: Create a RectanglePerimeter application that calculates and displays the perimeter of a rectangle with width 4 and length 13.

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class RectanglePerimeter

{

  public static void main(String[] args)

  {

    //The following lines declare int variables for the length and width of the rectangle along with assigning them values 
    int length = 13;
    int width = 4;

    //Declares and int variable for the perimeter 
    int perimeter;

    //calculates the perimeter of the rectangle
    perimeter = 2 * width + 2 * length;

    //outputs the permimeter of the rectangle to the user
    System.out.println("Rectangles Perimeter: " + perimeter);

  }

}

/* Screen Dump

Rectangles Perimeter: 34

*/