package chapter5;

/*

Program: NumberSum.java          Last Date of this Revision: March 9, 2022

Purpose: Critical thinking question #5 on pg. 70

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class NumberSum {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    
    int num = input.nextInt();
    
    int num2 = 0;
    
    int num3 = 0;
    
    while (num2 < num ) { 
    	
    	num2+=1; 
    	
    	num3 += num2;
    	
    	System.out.println(num2);
    
      }
    
     
    
    System.out.println(num3);
    
  } 
  
}
