package chapter2;

/*

Program: TicTacToe.java          Last Date of this Revision: March 7, 2022

Purpose: Create a tic-tac-toe board with an X in the center. 

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20
 
*/

public class TicTacToe

{

    public static void main(String[] args)

    {

        //stores text into a string 
        String str1 = "\t --------------------------------- \n";

        //outputs the tictactoe tile and the x in the middle to the screen
        System.out.println("\t\t | \t\t | \n\n");

        System.out.println("\t\t | \t\t | \n\n");

        // outputs the text that was stored in the string 
        System.out.println(str1);

        System.out.println("\t\t | \t\t | \n");

        System.out.println("\t\t\t X \n");

        System.out.println("\t\t | \t\t | \n");

        System.out.println(str1);

        System.out.println("\t\t | \t\t | \n\n");

        System.out.println("\t\t | \t\t | \n");

    }

}


/* Screen Dump

		 | 		 | 


		 | 		 | 


 --------------------------------- 

		 | 		 | 

			 X 

		 | 		 | 

 --------------------------------- 

		 | 		 | 


		 | 		 | 
 
 */