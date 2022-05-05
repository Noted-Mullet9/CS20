package chapter5;

/*

Program: Exercise6.java          Last Date of this Revision: May 5, 2022

Purpose: Create an application that prompts the user for a non-negative integer and then displays the sum of the digits

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class Exercise6 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    {
        //prompts a user for a 2 digit number
        System.out.print("Enter a positive number: ");

        //records user input
        int number = input.nextInt();

        //The following lines calculate which numbers are the ones, tens and hundreds places 
        int ones = (number / 1) % 10;

        int tens = (number / 10) % 10;

        int hundreds = (number / 100) % 10;
        
        int sum = ones + tens + hundreds; 

        //The following lines output which numbers belong in the ones, tens and hundreds place 
        System.out.print("\nThe sum of the digits is: " + sum); 
      }

    }
    	
  } 

/* Screen Dump

Enter a positive number: 55

The sum of the digits is: 10

*/


