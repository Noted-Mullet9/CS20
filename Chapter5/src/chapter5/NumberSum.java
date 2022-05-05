package chapter5;

/*

Program: NumberSum.java          Last Date of this Revision: May 5, 2022

Purpose: Create an application that prompts the user for a number and then displays the  numbers from 1 to the number entered and displays the sum below 

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class NumberSum {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: "); //prompts for a number
    
    int num = input.nextInt(); //records user input
    
    int num2 = 0;
    
    int num3 = 0;
    
    while (num2 < num ) { //makes sure that the numbers being displayed are never higher than the users input
    	
    	num2+=1; //continues adding 1 till it reaches the number entered by the user 
    	
    	num3 += num2; //calculates the sum of all the numbers 
    	
    	System.out.println("\n" +num2); //returns all the numbers in between 1 and the users input
    
      }
    
     
    
    System.out.println("\n" + num3); //returns the sum of all numbers diplayed
    
  } 
  
}

/* Screen Dump

Enter a number: 
10

1

2

3

4

5

6

7

8

9

10

55

 */