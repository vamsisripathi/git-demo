package oops;
 abstract class vehicle{
	String type,model;
	public vehicle(String type, String model) {
		this.type=type;
		this.model=model;
	}
	public void start() {
		System.out.println("vehicle has started");
	}
	public void stop() {
		System.out.println("vehicle has stopped");
	}
	abstract int getMaxSpeed();
}

   class Car extends vehicle{

	public Car(String type, String model) {
		super(type, model);
	}
	
	@Override 
	public int getMaxSpeed() {
		 final int MAX_CAR_SPEED=500;
		 System.out.println("Max speed of car is :"+ MAX_CAR_SPEED);
		return MAX_CAR_SPEED;
	 }
	
	@Override
	public void start() {
		System.out.println("car has started.");
	}
	@Override
	public void stop() {
		System.out.println("car has stopped");
	}
	}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Car ","audi");
		//why we taken loop here ????????////////
c1.start();
c1.stop();
c1.getMaxSpeed();
	}

}
