package inheritance;
class Bandi{
	String make,model;int year;
	public void print() {
		System.out.println("make:" + make);
		System.out.println("model:" + model);
		System.out.println("year:" + year);
		
	}
}
class cars extends Bandi{
	
}
class Motorcycle extends Bandi{

}

public class InheritanceMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cars c1=new cars();
c1.make="tayota";
c1.model="camry";
c1.year=2022;
c1.print();
// creating motor cycle object

Motorcycle m1=new Motorcycle();
m1.make="Honda";
m1.model="CBR500R";
m1.year=2021;
m1.print();

	}
}


	