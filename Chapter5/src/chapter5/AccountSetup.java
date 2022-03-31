package chapter5;

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
    
    System.out.println("Your entered pass is: " + password);

    
    
    
    
    
    
  }
  
}
