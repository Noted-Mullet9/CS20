package classEx;

   import java.text.NumberFormat;

   import java.util.Scanner;

 public class budgetCalc 
 
 {
	
 public static void main(String[] args) 

     {
	
   //new (int) variables are declared
   int food, clothing, entertainment, rent; 
   double totalExpenditure, foodPercent, clothingPercent, entertainmentPercent; 
	
       Scanner input = new Scanner(System.in);
	
     //user prompt is output to screen   
     System.out.println("Enter the amount spent last month");
	
     //user prompt is output and there input is recorded
     System.out.println("\n Food: $ \n");
     food = input.nextInt();
	
     //user prompt is output and there input is recorded
     System.out.println("\n Clothing: $ \n");
     clothing = input.nextInt();
	
     //user prompt is output and there input is recorded
     System.out.println("\n Entertainment: $ \n");
     entertainment = input.nextInt();

     //user prompt is output and there input is recorded
     System.out.println("\n Rent: $ \n");
     rent = input.nextInt();

       //value is given to totalExpenditure variable     
       totalExpenditure = (food + clothing + entertainment + rent);
	
       //value is given to foodPercent variable
       foodPercent = (food / totalExpenditure * 100); 
	
       //value is given to totalExpenditure variable
       clothingPercent = (clothing / totalExpenditure * 100);
	
       //value is given to totalExpenditure variable
       entertainmentPercent = (entertainment / totalExpenditure * 100);
	
       //determines which numbers will be formatted 
       NumberFormat nf = NumberFormat.getPercentInstance();
	
     //the calculated budget and amount spent are output as percentages   
     System.out.println("\n Category \t        Budget");
	
     System.out.println("\n Food: " + food + "\t\t" + nf.format(foodPercent));
	
     System.out.println("\n Clothing: " + clothing + "\t\t" + nf.format(clothingPercent));
	
     System.out.println("\n Entertainment: " + entertainment + "\t" + nf.format(entertainmentPercent));
	
     }
 }

 /* Screen Dump


 Enter the amount spent last month

 Food: $ 

 1

 Clothing: $ 

 2

 Entertainment: $ 

 3

 Rent: $ 

 4

 Category 	        Budget

 Food: 1		1,000%

 Clothing: 2		2,000%

 Entertainment: 3	3,000%



 */