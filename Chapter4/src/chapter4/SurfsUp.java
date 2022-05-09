package chapter4;

/*

Program: SurfsUp.java          Last Date of this Revision: May 9, 2022

Purpose: Create a SurfsUp application that prompts the user for the wave height then displays "Great day for surfing!" when the waves are 6 feet and over

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class SurfsUp {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int wHeight;

    System.out.println("What is the wave height today (in feet)?:     "); //prompts for wave height 

    wHeight = input.nextInt(); //records user input

    if (wHeight >= 6) { //the following lines return whether the wave height is ideal for surfing or not
      System.out.println("\nGreat day for surfing!");

    } else if (wHeight < 6) {

      System.out.println("\nSorry, the conditions for surfing aren't ideal.");
    }

  }

}

/* Screen Dump

What is the wave height today (in feet)?:     
8

Great day for surfing!


*/