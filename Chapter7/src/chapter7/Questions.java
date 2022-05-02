package chapter7;

public class Questions {
	
	public static int a;
	public static int b; 
	public static int correct;
	
	int count = 0;
	
	public Questions()
	{
	    a = (int)(20 * Math.random() + 0);
	    
	    b = (int)(20 * Math.random() + 0);
	}
	
    public String askQuestion() {
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




