package oops;



interface Drivable{
	 
	  abstract void turnLeft();
	  abstract void turnRight();
}

class Bike implements Drivable{
	@Override
	public void turnLeft() {
		System.out.println("bike can turn left");
	}
	@Override
	public void turnRight() {
		System.out.println("bike can turn right");
	}
	
}

 class Motorcycle implements Drivable{
	@Override
	public void turnLeft() {
		System.out.println("motorcycle can turn left");
	}
	@Override
	public void turnRight() {
		System.out.println("motorcycle can turn right");
	}
	
}
	
public class InterfaceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b1 = new Bike ();
b1.turnLeft();	
b1.turnRight();
//motor cycle object creation
Motorcycle m1 = new Motorcycle();
m1.turnLeft();
m1.turnRight();
	}

}
