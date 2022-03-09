package chapter3;

/*

Program: Exercise6.java          Last Date of this Revision: March 9, 2022

Purpose: Exercise #6 on pg.73.

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class Exercise6

{

  public static void main(String[] args)

  {

    Scanner input = new Scanner(System.in);

    //prompts a user for a 2 digit number
    System.out.print("Enter a 2 digit number: ");

    //records user input
    int number = input.nextInt();

    //The following lines calculate which numbers are the ones, tens and hundreds places 
    int ones = (number / 1) % 10;

    int tens = (number / 10) % 10;

    int hundreds = (number / 100) % 10;

    //The following lines output which numbers belong in the ones, tens and hundreds place 
    System.out.print("ones place: " + ones);

    System.out.print("\ntens place: " + tens);

    System.out.print("\nhundreds place: " + hundreds);

  }

}

/* Screen Dump

Enter a 2 digit number: 250
ones place: 0
tens place: 5
hundreds place: 2

 */