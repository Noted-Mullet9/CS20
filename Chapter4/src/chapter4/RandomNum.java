package chapter4;

/*

Program: CT2.java          Last Date of this Revision: March 9, 2022

Purpose: Critical thinking question #2 on pg. 70

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class RandomNum {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int Num1;

    int Num2;

    int Random;

    System.out.println("Enter a number: ");

    Num1 = input.nextInt();

    System.out.println("Enter a second number: ");

    Num2 = input.nextInt();

    Random = Num1 + (int)(Math.random() * (Num2 - Num1 + 1));

    System.out.println("Random number between the first and second number you entered: " + Random);

  }

}

/* Screen Dump

Enter a number: 
2
Enter a second number: 
5
Random number between the first and second number you entered: 5

*/