package chapter3;

 /*

 Program: Exercise5.java          Last Date of this Revision: March 9, 2022

 Purpose: Exercise #5 on pg.73.

 Author: Alador Tesema, 
 School: CHHS
 Course: Computer Science 20

 */

 import java.util.Scanner;

 public class Exercise5

 {

   public static void main(String[] args)

   {

     Scanner input = new Scanner(System.in);

     //prompts user for an amount of change under a dollar 
     System.out.println("Enter an amount less than 1:00$: ");

     //records user input
     int number = input.nextInt();

     //the following lines calculate how many quarters, dimes, nickels and pennies are required to make the change 
     int Quarters = (number / 25);

     int Dimes = (number % 25 / 10);

     int Nickels = (number % 10 / 5);

     int Pennies = (number % 5);

     //The following lines output how may of each kind of coin the user needs to make the change 
     System.out.println("The amount of coins required to make the change: ");

     System.out.println("Quarters: " + Quarters);

     System.out.println("Dimes: " + Dimes);

     System.out.println("Nickels: " + Nickels);

     System.out.println("Pennies: " + Pennies);

   }

 }

 /* Screen Dump

 Enter an amount less than 1:00$: 
 212
 The amount of coins required to make the change: 
 Quarters: 8
 Dimes: 1
 Nickels: 0
 Pennies: 2

 */