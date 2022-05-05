package chapter7;

/*

Program: PiggyBank.java          Last Date of this Revision: May 5, 2022

Purpose: Methods for the MySavings Application

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class PiggyBank {
  private double balance;

  public PiggyBank() {
    balance = 0;
  }

  public void addCoin(double cents) {
    balance = balance + cents;
  }

  public double giveTotal() {
    return balance;
  }

  public void removeCoin() {
    balance = 0;
  }

}