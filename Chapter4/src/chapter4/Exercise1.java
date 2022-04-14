package chapter4;

/*

Program: Exercise1.java          Last Date of this Revision: March 9, 2022

Purpose: Create a Printing application that prompts the user for the number of copies to print and then displays the price per copy and the total price for the job.

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class Exercise1 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int copies;
    
    double price = 0.25; 
    
    double total; 

    System.out.println("Enter the number of copies to be printed: ");

    copies = input.nextInt();

    System.out.println("\nPrice per copy is: $0.25");
    
    total = (double) (copies * price); 
    
    System.out.println("\nTotal cost is: " + total );

    }

  }

/* Screen Dump

Enter the number of copies to be printed: 
1001

Price per copy is: $0.25

Total cost is: 250.25


*/

