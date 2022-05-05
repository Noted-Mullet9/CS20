package chapter7;

/*

Program: Questions.java          Last Date of this Revision: May 5, 2022

Purpose: Methods for AdderGame

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class Questions {

  public static int a;
  public static int b;
  public static int correct;
  int tries = 0;
  int count = 0;

  public Questions() {
    a = (int)(20 * Math.random() + 0); //generates a random number

    b = (int)(20 * Math.random() + 0);
  }

  public String askQuestion() {

    a = (int)(20 * Math.random() + 0);

    b = (int)(20 * Math.random() + 0);

    correct = a + b; //determines the answer to the math question
    return ("What is " + a + " + " + b + " ?\n"); //outputs a math question using the random numbers

  }

}