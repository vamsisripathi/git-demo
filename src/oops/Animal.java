package oops;
 class Dog {	
	public void sound() {
		System.out.println("the dog says woof");
	}
}
 class Cat extends Dog {	
	public void sound() {
		System.out.println("the cat says meow");
	}
}
 class Bird extends Dog{
	 public void sound() {
		 System.out.println("nightangle say kuu kuu");
	 }
 }
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat c= new Cat();
c.sound();

Dog d=new Dog();
d.sound();

Bird b= new Bird();
b.sound();

	}	
	}
