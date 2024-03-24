package interfaceexample;

interface polygyn{
	void getArea(int length,int breadth);	
	}
 class Rectangle implements polygyn{
	public  void getArea(int length, int breadth){
	System.out.println("the area of rectangle is " +(length*breadth));
		
	}
	
}
 public class ReferenceIntrfaceExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1=new Rectangle();
r1.getArea(5, 60);
	}

}


	



