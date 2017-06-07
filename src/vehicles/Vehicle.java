package vehicles;

public abstract class Vehicle {

	private int numberOfWheels;
	private String make;
	private String model;
	private int numOfPassengers;
	private int rateOfSpeed;
	private int time;
	private int distance;

	//constructor
	public Vehicle(int rateOfSpeed) {
	 this.rateOfSpeed = rateOfSpeed;
	 System.out.println(this + " has a rate of speed of " + rateOfSpeed);
	}
	

	//Methods
	public void getDistanceToTravel(int time) {
		this.distance = rateOfSpeed * time;
		System.out.println("In " + time + " hrs" + " the distance traveled is " + distance + " miles");
	}

	public void getTimeToTravel(int distance) {
		this.time = distance / rateOfSpeed;
		System.out.println("It will take " + time + " hours to travel " + distance + " miles");
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
				}
}
