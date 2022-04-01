package chapter5;

import java.util.Scanner;

public class OddSum {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a numb: ");
    
    int num = input.nextInt();
    
    int num2 = 1;
    
    while (num2 < num ) { 
    	
    	System.out.println(num2);
    	
    	num2+=2;
    	
    	
      }
  } 
  
}

