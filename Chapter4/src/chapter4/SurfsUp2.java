package chapter4;

/*

Program: SurfsUp2.java          Last Date of this Revision: May 9, 2022

Purpose: Modify the SurfsUp application to display "Great day for surfing!" when the waves are 6 feet or over and "Go body boarding!" when the waves are less than 6 feet

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class SurfsUp2 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int wHeight;

    System.out.println("What is the wave height today (in feet)?:     "); //prompt for wave height 

    wHeight = input.nextInt(); //records user input

    if (wHeight >= 6) { //the following lines return whether the user should surf or body board instead
      System.out.println("\nGreat day for surfing!");

    } else if (wHeight > 3 && wHeight < 6) {

      System.out.println("\nGo body boarding!");

    }

  }

}

/* Screen Dump

What is the wave height today (in feet)?:     
10

Great day for surfing!

*/