package chapter4;

import java.util.Scanner;

public class RandomNum {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int Num1;
    
    int Num2;
    
    int Random;

    System.out.println("Enter a number: ");

    Num1 = input.nextInt();
    
    System.out.println("Enter a second number: ");

    Num2 = input.nextInt();
    
    Random = Num1 + (int) (Math.random() * (Num2 - Num1 + 1));
    
    System.out.println("Random Number inbetween the 1st and second number you entered: " + Random);

  }

}