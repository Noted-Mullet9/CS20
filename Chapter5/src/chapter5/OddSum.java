package chapter5;

/*

Program: OddSum.java          Last Date of this Revision: March 9, 2022

Purpose: Critical thinking question #5 on pg. 70

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class OddSum {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    
    int num = input.nextInt();
    
    int num2 = 1;
    
    int num3 = 0; 
    
    while (num2 < num ) { 
    	
    	System.out.println(num2);
    	
    	num2+=2;
    	
    	num3 += num2; 

      }
    
    System.out.println(num3);
    
  } 
  
}

