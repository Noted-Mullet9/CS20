package chapter4;

/*

Program: Exercise5.java          Last Date of this Revision: March 9, 2022

Purpose: Create a Grade application that prompts the user for the percentage earned on a test or other graded work and then displays the corresponding letter grade

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class Exercise5 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int percent;

    System.out.println("Enter the percentage: ");

    percent = input.nextInt();

    if (percent >= 90 && percent <= 100) {
     
      System.out.println("\nThe corresponding letter grade is: A");

    } else if (percent >= 80 && percent <= 89) {

      System.out.println("\nThe corresponding letter grade is: B");

    } else if (percent >= 70 && percent <= 79) {

      System.out.println("\nThe corresponding letter grade is: C");

    } else if (percent >= 60 && percent <= 69) {

      System.out.println("\nThe corresponding letter grade is: D");

    } else if (percent < 60) {
 
      System.out.println("\nThe corresponding letter grade is: F");

      }


  }

}

/* Screen Dump

Enter the percentage: 
88

The corresponding letter grade is: B

*/