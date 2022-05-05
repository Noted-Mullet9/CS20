package chapter5;

/*

Program: Evens.java          Last Date of this Revision: May 5, 2022

Purpose: Create an application that displays the even numbers between 1 and 20

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class Evens {

  public static void main(String[] args) {

    System.out.println("Even numbers between 1 and 20: \n"); //returns all even numbers between 1 and 20

int num = 0; //initializes num and assigns it a value of 0

while (num < 20 ) { //continues adding 2 to the initial value of num as long as it is under 20
	
	num+=2; 
	
	System.out.println(num); //returns num
	
  }

} 
}

/* Screen Dump

Even numbers between 1 and 20: 

2
4
6
8
10
12
14
16
18
20


*/

