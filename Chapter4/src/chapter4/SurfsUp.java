package chapter4;

import java.util.Scanner;

public class SurfsUp {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int wHeight;

    System.out.println("What is the wave height today (in feet)?:     ");

    wHeight = input.nextInt();

    if (wHeight >= 6) {
      System.out.println("Great day for surfing!");

    } else if (wHeight < 6) {

      System.out.println("Sorry, the conditions for surfing aren't ideal.");
    }

  }

}