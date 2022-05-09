package chapter4;

/*

Program: Hurricane.java          Last Date of this Revision: May 9, 2022

Purpose: Create a Hurricane application that displays the wind speed for the hurricane category entered by the user

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class Hurricane {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int Category;

    System.out.println("What category level is this Hurricane: "); //prompts for the category level of the hurricane

    Category = input.nextInt(); //records user input

    switch (Category) { //the following lines look at the hurricanes category level and return its wind speeds in kt or km/h

    case 1:

      System.out.println("\nCategory 1: 74-95 mph or 64-82 kt or 119-153 km/hr");

      break;

    case 2:

      System.out.println("\nCategory 2: 96-110 mph or 83-95 kt or 154-177 km/hr");

      break;

    case 3:

      System.out.println("\nCategory 3: 111-130 mph or 96-113 kt or 178-209 km/hr");

      break;

    case 4:

      System.out.println("\nCategory 4: 131-155 mph or 113-155 kt or 210-249 km/hr");

      break;

    case 5:

      System.out.println("\nCategory 5: greater than 155 mph or 135 kt or 249 km/hr");

      break;

    }

  }

}

/* Screen Dump

What category level is this Hurricane: 
5

Category 5: greater than 155 mph or 135 kt or 249 km/hr



*/