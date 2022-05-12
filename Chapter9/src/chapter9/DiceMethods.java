package chapter9;

public class DiceMethods {
	
public int[] outcomes = new int[19];
int numRolls; 
int outcome; 


	public DiceMethods() {

		numRolls = 0;
		outcome = 0;

	}

	public String askQuestion() {
	
		return ("How many rolls?");	

	}
 
	public void setRolls(int v) {
		  
		numRolls = v;
	 
	}

 
 
	public void calculate() {

		for (int roll = 0; roll < numRolls; roll++) {
		  
			outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
		  
			outcomes[outcome] += 1;
	 
		}
		
	}
	
	public String giveOutcomes(int i) {
	     
		return (" " + i + ": " + outcomes[i]);
			 
			
	}
}
