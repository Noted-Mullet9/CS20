package chapter4;

/*

Program: Exercise6.java          Last Date of this Revision: May 9, 2022

Purpose: Create a RandomNum application that prompts the user with a randomly generated addition, subtraction, multiplication, 
and division math question

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class Exercise6 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int random;
    
    int random2;
    
    int random3; 
    
    int problem = 0; 
    
    

    random = (int)(10 * Math.random() + 1); //the following lines create 3 random numbers
    
    random2 = (int)(10 * Math.random() + 1);
    
    random3 = (int)(4 *Math.random() + 1);
    
    switch (random3) { //the following lines determine whether to return an addition, subtraction, multiplication, or division question 
    //and calculate the answer 

    case 1:

      problem = random + random2; //calculates the answer to the math question
      
      System.out.println("What is " + random + " + " + random2); //returns math question 
      
      int answer = input.nextInt(); //records user input

      break;

    case 2:

        problem = random - random2; 
        
        System.out.println("What is " + random + " - " + random2);
        
        answer = input.nextInt();

      break;

    case 3:

        problem = random * random2; 
        
        System.out.println("What is " + random + " * " + random2);

      break;

    case 4:

        problem = random / random2; 
        
        System.out.println("What is " + random + " / " + random2);
        

      break;


    }
    
    int answer = input.nextInt(); //records user input
    
    if (answer == problem) { //the following lines determine whether the user answered the question right or wrong and returns it
        
        System.out.println("\nCorrect!");

      } else if (answer != problem) {

        System.out.println("\nWrong!");

        }

    
    
  }

}

/* Screen Dump

What is 1 * 3
3

Correct!

*/