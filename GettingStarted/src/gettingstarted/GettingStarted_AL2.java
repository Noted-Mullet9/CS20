
package gettingstarted;

//Add Phidgets Library
import com.phidget22.*;

public class GettingStarted_AL2 {
    public static void main(String[] args) throws Exception{

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);
        
        //Close your Phidgets
        temperatureSensor.close();
        
        temperatureSensor.open();
        
        
        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        

    }
}
  