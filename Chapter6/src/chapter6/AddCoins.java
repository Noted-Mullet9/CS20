package chapter6;

import java.util.Scanner;

public class AddCoins {
	
	public static void getDollarAmount() {
		
		double quarters, dimes, nickels, pennies, total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your total coins: ");
		
		System.out.println("\nQuarters: ");

		quarters = (double) (input.nextDouble() * 0.25);	
		
		System.out.println("\nDimes: ");

		dimes = (double) (input.nextDouble() * 0.10);
		
		System.out.println("\nNickels: ");

		nickels = (double) (input.nextDouble() * 0.05);	
		
		System.out.println("\nPennies: ");

		pennies = (double) (input.nextDouble() * 0.01);	
		
		input.close();
		
		total = quarters + dimes + nickels + pennies; 
		
		System.out.println("\nTotal: $" + total);
		
	}
		
		
		public static void main(String[] args) {
			
			getDollarAmount();
			
			
		}

		}

