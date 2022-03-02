 package classEx;

   import java.text.NumberFormat;

   import java.util.Scanner;

 public class budgetCalc 
 
 {
	
 public static void main(String[] args) 

     {
	
   int food, clothing, entertainment, rent; 
   double totalExpenditure, foodPercent, clothingPercent, entertainmentPercent; 
	
       Scanner input = new Scanner(System.in);
				
     System.out.println("Enter the amount spent last month");
	
     System.out.println("\n Food: $ \n");
     food = input.nextInt();
	
     System.out.println("\n Clothing: $ \n");
     clothing = input.nextInt();
	
     System.out.println("\n Entertainment: $ \n");
     entertainment = input.nextInt();

     System.out.println("\n Rent: $ \n");
     rent = input.nextInt();

       totalExpenditure = (food + clothing + entertainment + rent);
	
       foodPercent = (food / totalExpenditure * 100); 
	
       clothingPercent = (clothing / totalExpenditure * 100);
	
       entertainmentPercent = (entertainment / totalExpenditure * 100);
	
       NumberFormat nf = NumberFormat.getPercentInstance();
	
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