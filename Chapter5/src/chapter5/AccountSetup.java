package chapter5;

/*

Program: AccountSetup.java          Last Date of this Revision: May 5, 2022

Purpose: Create an application that prompts the user for a username and password

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

import java.util.Scanner;

public class AccountSetup {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a username: "); //prompts the user for a username

    String username = input.nextLine(); //records user input
    
    System.out.println("\nEnter a password: "); //prompts the user for a password

    String password = input.nextLine(); 
    
    username = username.toLowerCase(); //converts any uppercase letters to lowercase
    
    password = password.toLowerCase();
    
    System.out.println("\nYour entered username is: " + username); //returns the entered username
    
    System.out.println("\nYour entered password is : " + password); //returns the entered password
        
  }
  
}

/* Screen Dump

Enter a username: 
alador

Enter a password: 
tesema

Your entered username is: alador

Your entered password is : tesema

*/
