 package chapter3;

 /*

 Program: Digits.java          Last Date of this Revision: September 30, 2019

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
	 
	 System.out.print("Enter a 2 digit number: ");
     
	 int number = input.nextInt();
	 
	 int ones=(number/1)%10;
	 
	 int tens= (number/10)%10;
	 
	 System.out.print("ones place: " + ones);
	 
	 System.out.print("\ntens place: " + tens);
	 
     }

 }


 /* Screen Dump

 Enter a 2 digit number: 25
 ones place digit: 5
 tens place digit: 2

 */