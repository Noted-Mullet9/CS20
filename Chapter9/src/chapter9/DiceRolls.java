package chapter9;

import java.util.Scanner;

public class DiceRolls {
	
	  public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);
		  
		  //creates array
		  int[] outcomes = new int[13];
		  
		  //creates 2 variables one for the number of rolls that the user will request and one for the outcome of those rolls
		  int numRolls; 
		  
		  int outcome; 
		  
		  //prompt user for number of rolls
		  System.out.println("How many rolls? ");
		  numRolls = input.nextInt();
		  
		  //roll dice and add to outcomes
		  for (int roll = 0; roll < numRolls; roll++) {
			  
			  outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
			  
			  outcomes[outcome] += 1;
			 
			}
		  
		  //shows count of outcomes
		  for (int i = 2; i <= 12; i++) {
			  
			  System.out.println("\n" + i + ": " + outcomes[i]);
			 
			}
		  
		  
		  
		  
		  
	  }

}
