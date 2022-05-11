package chapter9;

public class Squares
{
	
	  public static void main(String[] args)
	  {
		  
		 

		  //creates array
		  int[] numbers = new int [5];
		  
		  //store numbers
		  for (int i = 0; i < numbers.length; i++) {
			  
			  //squares the value of each element in the array
			  numbers[i] = i * i;
			 
		}
		  
		  //creates a for loop that displays the squared value of each element in the array
		  for (int n : numbers){
				
	            System.out.println("\n" + n);
		  }
		  
	  }

}
