
package gettingstarted;

//Add Phidgets Library 
import com.phidget22.*;

public class GettingStarted_AL1 {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{
    	
    	int test = 0;

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
        
        while (true) {
        
        redLED.setDutyCycle(0.01);
        Thread.sleep(1000);
        redLED.setDutyCycle(0.05);
        Thread.sleep(1000);
        redLED.setDutyCycle(0.1);
        
        test ++;
        
        if (test == 1) {
        	
            redLED.setDutyCycle(0.1);
            Thread.sleep(1000);
            redLED.setDutyCycle(0.05);
            Thread.sleep(1000);
            redLED.setDutyCycle(0.01);
        	
        }
        	
        }

    }
}
  