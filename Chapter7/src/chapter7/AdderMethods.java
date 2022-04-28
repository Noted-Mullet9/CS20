package chapter7;

import java.util.Scanner;

public class AdderMethods {
	
	public static int random; 
	public static int random2; 
	public static String question;
	public static int answer;
	public static int points;
	private int score = 0;
	public static int tries = 0;
	
	AdderGame ag = new AdderGame();
	Scanner input = new Scanner(System.in);
	
	public AdderMethods()
	{
		random = (int) (Math.random() * 20) + 0;
		random2 = (int) (Math.random() * 20) + 0;
		answer = random + random2;
		score = points;
		question = random + " + " + random2;
}
	
	public void addPoints(int points)
	{
		 points = points + 1;
	}
	
	
	public void addQuestion()
	{
		System.out.println(question);
		
	}
	
	
	public int giveScore()
	{
		return score;
	}
	

	
}
