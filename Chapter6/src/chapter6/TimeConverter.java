package chapter6;

import java.util.Scanner;

public class TimeConverter {
	
	public static void htoM () {
		
	int minutes, hours, days;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("\nEnter amount of hours: ");	 
	
	hours = input.nextInt();	
	
	input.close();
	
	minutes = hours * 60; 
	
	System.out.println("\nAmount of minutes equiavalent to hours you entered: " + minutes);

	}
	
	
	public static void dtoH () {
		
	int minutes, hours, days;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("\nEnter amount of days: ");	 
	
	days = input.nextInt();	
	
	input.close();
	
	hours = days * 24; 
	
	System.out.println("\nAmount of hours equiavalent to days you entered: " + hours);

	}
	
	public static void mtoH () {
		
	int minutes, hours, days;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("\nEnter amount of minutes: ");	 
	
	minutes = input.nextInt();	
	
	input.close();
	
	hours = minutes / 60; 
	
	System.out.println("\nAmount of hours equiavalent to minutes you entered: " + hours);

	}
	
	public static void htoD () {
		
	int minutes, hours, days;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("\nEnter amount of hours: ");	 
	
	hours = input.nextInt();	
	
	input.close();
	
	days = hours / 24; 
	
	System.out.println("\nAmount of days equiavalent to hours you entered: " + days);

	}
	
	public static void main(String[] args) {
		
		int choice; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Hours to minutes conversion");
		
		System.out.println("2. Days to hours conversion");
		
		System.out.println("3. Minutes to hours conversion");
		
		System.out.println("4. Hours to days conversion");
		
		System.out.println("\nEnter your choice: ");
		
		choice = input.nextInt();
		
		if (choice == 1) {
			
			htoM(); 
			
		}
		
		else if (choice == 2) {
			
			dtoH(); 
			
		}
		
	else if (choice == 3) {
			
			mtoH(); 
			
		}
		
	else if (choice == 4) {
		
		htoD(); 
		
	}
		
		
		
		
		
	}


}
