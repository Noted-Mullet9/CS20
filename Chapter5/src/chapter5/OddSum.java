package chapter5;

/*

Program: OddSum.java          Last Date of this Revision: May 5, 2022

Purpose: Create an application that prompts the user for a number and then sums the odd numbers from 1 to the number entered

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class OddSum {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: "); //prompts user for a number
    
    int num = input.nextInt(); //records input
    
    int num2 = 1;
    
    int num3 = 0; 
    
    while (num2 < num ) { 
    	
    	System.out.println("\n" + num2); //returns all odd numbers between 1 and the number entered
    	
    	num2+=2; //keeps adding 2 till it reaches the number entered by the user
    	
    	num3 += num2; //calculates the sum of all numbers displayed

      }
    
    System.out.println("\n" + num3); //returns the sum of all numbers displayed
    
  } 
  
}

/* Screen Dump

Enter a number: 
10

1

3

5

7

9

35


*/

