package chapter3;

import java.util.Scanner;

/*

Program: Exercise5.java          Last Date of this Revision: September 30, 2019

Purpose: Create a BinaryNumbers application that illustrates the binary numbers 1 through 20 and their decimal equivalents.

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;
public class Exercise5

{

  public static void main(String[] args)

  {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter an amount less than 1:00$: ");

    int number = input.nextInt();

    int Quarters = (number / 25);

    int Dimes = (number % 25 / 10);

    int Nickels = (number % 10 / 5);

    int Pennies = (number % 5);

    System.out.println("The amount of coins required to make the change: ");

    System.out.println("Quarters: " + Quarters);

    System.out.println("Dimes: " + Dimes);

    System.out.println("Nickels: " + Nickels);

    System.out.println("Pennies: " + Pennies);

  }

}