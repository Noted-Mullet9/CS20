package chapter5;

/*

Program: AccoutnSetup.java          Last Date of this Revision: March 9, 2022

Purpose: Critical thinking question #5 on pg. 70

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class AccountSetup {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a username: ");

    String username = input.nextLine();
    
    System.out.println("Enter a username: ");

    String password = input.nextLine();
    
    username = username.toLowerCase();
    
    password = password.toLowerCase();
    
    System.out.println("Your entered username is: " + username);
    
    System.out.println("Your entered password is : " + password);

    
    
    
    
    
    
  }
  
}
