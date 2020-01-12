package defaultAndStaticMethods;
import java.util.Calendar;

// This is the implementation class of the Vehicle* interface
public class VehicleImpl implements VehicleInterfaceWithDefaultAndStaticMethods {

	boolean vehicleStarted=false;
	public static void main(String[] args) {
		
		VehicleInterfaceWithDefaultAndStaticMethods vehicle = new VehicleImpl();

		// This invokes the default method defined in the interface
		System.out.println("Current year : "+ vehicle.getCurrentYear());
		
		// This invokes the overridden method in this implementation 		
		System.out.println("Current month : "+ vehicle.getCurrentMonth());
		
		// This invokes the static method in the interface
		System.out.println("Convert 10 Kms to Miles : "+VehicleInterfaceWithDefaultAndStaticMethods.convertKmToMiles(10));
		
	}
	
	// Below is an example when one of the default methods has been overriden, it is perfectly possible!
	// While the other default method (getCurrentYear) has NOT been overridden
	@Override
	public int getCurrentMonth() {
		return Calendar.JUNE;
	}	
	
	
	// Below code contains implementations of regular abstract methods of the interfaces 
	public int startRunning(){
		if (vehicleStarted) {
			return -1;
		} else {
			return 1;
		}
	}	
	public int stopRunning(){
		if (!vehicleStarted) {
			return 1;
		} else {
			return -1;
		}
	}	
	

}
