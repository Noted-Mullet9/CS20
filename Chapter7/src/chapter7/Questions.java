package chapter7;

/*

Program: AccoutnSetup.java          Last Date of this Revision: March 9, 2022

Purpose: Critical thinking question #5 on pg. 70

Author: Alador Tesema, 
School: CHHS
Course: Computer Science 20

*/

public class Questions {
	
	public static int a;
	public static int b; 
	public static int correct;
	int tries = 0;
	int count = 0;
	
	public Questions()
	{
	    a = (int)(20 * Math.random() + 0);
	    
	    b = (int)(20 * Math.random() + 0);
	}
	
    public String askQuestion() {
    	
	    a = (int)(20 * Math.random() + 0);
	    
	    b = (int)(20 * Math.random() + 0);
    	
    	correct = a + b;    
    	return ("What is " + a + " + " + b + " ?\n");
            
        }
    
    public String Check(int response) {
        
    	if (response == correct) {
    		count++;
    
    		return ("yes.\n");
   
        } else {
            
        	return ("No. It is " + correct + ".\n");
        }
    }
    
    }




