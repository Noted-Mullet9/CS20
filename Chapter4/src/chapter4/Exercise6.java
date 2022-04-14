package chapter4;

/*

Program: Exercise6.java          Last Date of this Revision: March 9, 2022

Purpose: Create a RandomNum

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
    
    int problem; 
    
    

    random = (int)(10 * Math.random() + 1);
    
    random2 = (int)(10 * Math.random() + 1);
    
    random3 = (int)(4 *Math.random() + 1);
    
    switch (random3) {

    case 1:

      problem = random + random2; 
      
      System.out.println("What is" + random + "+" + random2);
      
      int answer = input.nextInt();

      break;

    case 2:

        problem = random - random2; 
        
        System.out.println("What is" + random + "-" + random2);
        
        int answer = input.nextInt();

      break;

    case 3:

        problem = random * random2; 
        
        System.out.println("What is" + random + "*" + random2);

      break;

    case 4:

        problem = random / random2; 
        
        System.out.println("What is" + random + "/" + random2);
        

      break;


    }
    
    int answer = input.nextInt();

    
    
  }

}

/* Screen Dump

Enter a number: 
2

Enter a second number: 
5

Random number between the first and second number you entered: 4

*/