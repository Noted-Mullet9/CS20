package chapter4;

/*

Program: SurfsUp3.java          Last Date of this Revision: May 9, 2022

Purpose: Modify the SurfsUp application to display "Great day for surfing!" when the waves are 6 feet or over, "Go body boarding!" 
         when the waves are between 3 and 6 feet, "Go for a swim." when the waves are from 0 to 3 feet 
         and "Whoa! What kind of surf is that?" otherwise. 

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class SurfsUp3 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int wHeight;

    System.out.println("What is the wave height today (in feet)?:     "); //prompts for wave height 

    wHeight = input.nextInt(); //records user input

    if (wHeight >= 6) { //the followeing lines return whether user should go surfing, body boarding, swimming, or not go at all 
      System.out.println("Great day for surfing!");

    } else if (wHeight > 3 && wHeight < 6) {

      System.out.println("Go body boarding!");

    } else if (wHeight > 0 && wHeight < 3) {

      System.out.println("Go for a swim!");

    } else if (wHeight < 0) {

      System.out.println("\nWhoa! What kind of surf is that?");

    }

  }

}

/* Screen Dump

What is the wave height today (in feet)?:     
-5

Whoa! What kind of surf is that?


*/