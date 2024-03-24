package oops;
 abstract class Shape{
	abstract void input();
	abstract void area();
	}
class circle extends Shape{
	int r=0;
	double pi = 3.14, ar=0;
	public void input() {
		r=5;
	}
	public void area() {
		ar=pi*r*r;
		System.out.println("area of circle:"+ar);
	}
	
	
}
class rectangle extends circle{
	int i=0, b=0;
	double ar;
	public void input() {
		super.input();
		i=6;
		b=4;
	}
	public void area() {
		super.area();
		ar=i*b;
		System.out.println("area of rectangle:"+ar);
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle r1=new rectangle();
r1.input();
r1.area();
	}

}
