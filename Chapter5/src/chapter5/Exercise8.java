 package chapter5;
 
 /*

 Program: Exercise8.java          Last Date of this Revision: March 9, 2022

 Purpose: Critical thinking question #5 on pg. 70

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
        	 
        	 //prompts a user for a 2 digit number
             System.out.print("Enter a number between 1 and 20: ");

             //records user input
              number = input.nextInt();
              
         if (number != random) {
              
              System.out.println("Sorry you guessed wrong. \n");
         }
        	}
        	
         while (number != random);

        	  }
         
         System.out.println("Congrats you guessed correct! ");
         
         
       }
 }
