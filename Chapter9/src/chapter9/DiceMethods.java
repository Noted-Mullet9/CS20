package chapter9;

/*

Program: DiceMethods.java          Last Date of this Revision: May 18, 2022

Purpose: Methods application for DiceRolls

Author: Alador Tesema, 
School: CHHS
Course: Computer Programming 20
 

*/

public class DiceMethods {

  //creates an array with 18 indexes
  public int[] outcomes = new int[19];

  int numRolls;
  int outcome;

  public DiceMethods() {

    //assign values to the numRolls and outcome variables
    numRolls = 0;
    outcome = 0;

  }

  public String askQuestion() {

    //prompts the user for the amount of times they want to roll the dice
    return ("How many rolls?");

  }

  public void setRolls(int v) {

    //assigns numRolls the value of an empty variable which will eventually be the users output 
    numRolls = v;

  }

  public void calculate() {

    //calculates the outcomes of all the dice rolls
    for (int roll = 0; roll < numRolls; roll++) {

      outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);

      outcomes[outcome] += 1;

    }

  }

  public String giveOutcomes(int i) {

    //displays the already calculated outcomes
    return (" " + i + ": " + outcomes[i]);

  }
}