package vehicles;

public class VehicleApp {

	public static void main(String[] args) {

		//constructor
		Vehicle car = new Car(65);
		car.getDistanceToTravel(5);
		car.getTimeToTravel(105);
		
		Vehicle bicycle = new Bicycle(20);
		bicycle.getDistanceToTravel(5);
		bicycle.getTimeToTravel(105);
		
		
	}//end main

}//end class
