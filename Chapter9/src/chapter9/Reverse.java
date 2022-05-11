package chapter9;

public class Reverse {

	  public static void main(String[] args) {
		  
		  final int num_elements = 10;
		  
		  //creates array
		  int [] numbers = new int [num_elements];
		  
		  //store numbers
		  for (int i = 0; i < num_elements; i++) {
			  
			  numbers[i] = i;
			 
			}
		  
		  //display countdown
		  System.out.println("Countdown!!!!");
		  
		  //creates a for loop that displays all the numbers in the array in reversed order
		  for (int i = num_elements - 1; i >= 0; i--) {
			  
			  System.out.println("\n" + numbers[i]);
			 
			}
		  

		  
	  }
	
	

}
