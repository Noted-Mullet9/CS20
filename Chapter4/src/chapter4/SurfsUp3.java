package chapter4;

/*

Program: CT2.java          Last Date of this Revision: March 9, 2022

Purpose: Critical thinking question #2 on pg. 70

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class SurfsUp3 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int wHeight;

    System.out.println("What is the wave height today (in feet)?:     ");

    wHeight = input.nextInt();

    if (wHeight >= 6) {
      System.out.println("Great day for surfing!");

    } else if (wHeight > 3 && wHeight < 6) {

      System.out.println("Go body boarding!");

    } else if (wHeight > 0 && wHeight < 3) {

      System.out.println("Go for a swim!");

    } else if (wHeight < 0) {

      System.out.println("Whoa! What kind of surf is that?");

    }

  }

}