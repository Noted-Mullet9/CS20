package chapter7;

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
