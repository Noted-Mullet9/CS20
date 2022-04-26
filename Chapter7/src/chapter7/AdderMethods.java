package chapter7;

import java.util.Scanner;

public class AdderMethods {
	
	public static int random; 
	public static int random2; 
	private int answer;
	private int score = 0;
	private int tries = 0;
	
	Scanner input = new Scanner(System.in);
	
	public AdderMethods()
	{
		random = (int) (Math.random() * 20) + 0;
		random2 = (int) (Math.random() * 20) + 0;
		answer = random + random2;
}
	
	public void addScore(int points)
	{
		 score = score + points;
	}
	
	public int giveScore()
	{
		return score;
	}
	

	
}
