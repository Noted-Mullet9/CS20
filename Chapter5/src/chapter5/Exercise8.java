 package chapter5;
 
 /*

 Program: Exercise8.java          Last Date of this Revision: May 5, 2022

 Purpose: Create an application that prompts the user to guess a number between 1 and 20

 Author: Alador Tesema, 
 School: CHHS
 Course: Computer Science 20

 */
 
 import java.util.Scanner;

 public class Exercise8 {

   public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     {
    	 
    	 int max = 20;
    	 int min = 1;
    	 int number = 0;
    			 
    	 int random = (int)(Math.random()*(max-min+1)+min);
         
         do {
        	 
        	 //prompts a user for a number between 1 and 20
             System.out.print("Enter a number between 1 and 20: ");

             //records user input
              number = input.nextInt();
              
         if (number != random) { //determines if the users guess was incorrect 
              
              System.out.println("\nSorry you guessed wrong. \n"); //returns that the user was wrong
         }
        	}
        	
         while (number != random); //determines if the users guess was correct 

        	  }
         
         System.out.println("\nCongrats you guessed correct! "); //returns the user was correct
         
         
       }
 }
 
 /* Screen Dump

Enter a number between 1 and 20: 8

Congrats you guessed correct! 

 */

