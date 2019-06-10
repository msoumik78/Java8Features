import java.util.Calendar;

/*
 This interface is a Java 8 interface which provides the capability to add default and static methods.
 */

public interface VehicleInterfaceWithDefaultAndStaticMethods {
	
   // Below is an example of a static method 	
	static double convertKmToMiles(double distanceInKm){
		return distanceInKm*0.6214;
	}
	
	
	// Below are 2 examples of default methods (containing implementations) within interface,
	// so that the implementing classes don't need to implement these methods
	default int getCurrentYear(){
		return Calendar.getInstance().get(Calendar.YEAR);
	}	

	default int getCurrentMonth(){
		return Calendar.getInstance().get(Calendar.MONTH);
	}		
	
	
	// Below are standard abstract methods of the interface
	int startRunning();
	
	int stopRunning();

}
