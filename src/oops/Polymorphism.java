package oops;
class Scooter{
	void run() {
		System.out.println("running safely");
	}
}
	class Splendor extends Scooter{
		void run() {
			System.out.println("with 60");
		
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scooter s2=new Splendor();  //upcasting
s2.run();
	}

}
