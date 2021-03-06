package chapter4;

/*

Program: RandomNum.java          Last Date of this Revision: May 9, 2022

Purpose: Create a RandomNum application that prompts the user for two numbers.
         The first number is a minimum value and the second is a maximum value. 
         RandomNum then displays an integer between the min and max value entered by the user. 

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class RandomNum {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int Num1;

    int Num2;

    int Random;

    System.out.println("Enter a number: "); //the following lines prompt for 2 numbers and record it

    Num1 = input.nextInt();

    System.out.println("\nEnter a second number: ");

    Num2 = input.nextInt();

    Random = Num1 + (int)(Math.random() * (Num2 - Num1 + 1)); //creates a random number inbetween 
    //the first and second numbers entered by the user

    System.out.println("\nRandom number between the first and second number you entered: " + Random); //returns the number that was calculated

  }

}

/* Screen Dump

Enter a number: 
2

Enter a second number: 
5

Random number between the first and second number you entered: 4

*/