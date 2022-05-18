package chapter9;

/*

Program: Squares.java          Last Date of this Revision: May 18, 2022

Purpose: An application that stores the square of an elements index in an integer array of 5 elements 
and then diplays the value of each element in the array

Author: Alador Tesema, 
School: CHHS
Course: Computer Programming 20
 

*/

public class Squares {

  public static void main(String[] args) {

    //creates array
    int[] numbers = new int[5];

    //store numbers
    for (int i = 0; i < numbers.length; i++) {

      //squares the value of each element in the array
      numbers[i] = i * i;

    }

    //creates a for loop that displays the squared value of each element in the array
    for (int n: numbers) {

      System.out.println("\n" + n);
    }

  }

}

/* Screen Dump

0

1

4

9

16
 
 */