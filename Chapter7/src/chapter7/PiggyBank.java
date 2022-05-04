package chapter7;

/*

Program: AccoutnSetup.java          Last Date of this Revision: March 9, 2022

Purpose: Critical thinking question #5 on pg. 70

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class PiggyBank 
{
	private double balance;
	
	
	public PiggyBank()
	{
		balance = 0;
	}
	
	public void addCoin(double cents)
	{
		balance = balance + cents;
	}
	
	public double giveTotal()
	{
		return balance;
	}
	
	public void removeCoin()
	{
		balance = 0;
	}
	
	
}
