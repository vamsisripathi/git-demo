package oops;
class One{
	public void m1(){
		System.out.println("vamsi");
	
	}
}
class Two extends One{
	public void m2() {
		System.out.println("krishna");
	}
}

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Two s1=new Two();
s1.m1();
s1.m2();
	}

}
