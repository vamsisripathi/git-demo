package oops;
class person{
	private String name;
	private int age;
	public person(String name, int age) {
		this.name = name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class ClassandObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
person p1= new person("vamsi",24);
System.out.println(p1.getName()+"is"+p1.getAge()+"years old");
	}

}
