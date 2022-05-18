package chapter9;

/*

Program: StudentRoster.java          Last Date of this Revision: May 18, 2022

Purpose: An application that prompts the user for the number of students in the class 
and then prompts the user for each students name and stores said name in an array. 
After all the names have been entered the application will return all the names with "Student Roster" as a header. 

Author: Alador Tesema, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

public class StudentRoster {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //asks user for the amount of students in the class
    System.out.println("How many students are in the class?");

    //records the users input
    int number = input.nextInt();

    input.nextLine();

    //creates an array with as many elements as described by the user
    String[] students = new String[number];

    //for loop that asks the user for the name of every element in the array and records the input
    for (int i = 0; i < number; i++) {

      System.out.print("\nEnter a students name: ");
      students[i] = input.nextLine();

    }

    //displays a header titles Student Roster
    System.out.println("\nStudent Roster");

    //Creates a for loop that prints out every students name
    for (String s: students) {

      System.out.println("\n" + s);

    }

  }

}

/* Screen Dump

How many students are in the class?
5

Enter a students name: Map

Enter a students name: Cap

Enter a students name: Sap

Enter a students name: Lap

Enter a students name: Tap

Student Roster

Map

Cap

Sap

Lap

Tap
 
 */