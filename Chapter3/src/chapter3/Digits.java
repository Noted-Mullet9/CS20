package chapter3;

 /*

 Program: Digits.java          Last Date of this Revision: March 9, 2022

 Purpose: Create a BinaryNumbers application that illustrates the binary numbers 1 through 20 and their decimal equivalents.

 Author: Alador Tesema, 
 School: CHHS
 Course: Computer Science 20
 
 */

 import java.util.Scanner;
 public class Digits

 {

   public static void main(String[] args)

   {

     Scanner input = new Scanner(System.in);

     //prompts user for a 2 digit number 
     System.out.print("Enter a 2 digit number: ");

     //records the users input as an int value 
     int number = input.nextInt();

     //The following lines calculate which number is in the ones and tens place
     int ones = (number / 1) % 10;

     int tens = (number / 10) % 10;

     //The following lines output the numbers that are in the ones and tens place to the screen
     System.out.print("ones place: " + ones);

     System.out.print("\ntens place: " + tens);

   }

 }

 /* Screen Dump

Enter a 2 digit number: 25
ones place: 5
tens place: 2

 */