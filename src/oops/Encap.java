package oops;
public class Encap {

	private String  username;
	private int eid;
	private int age;
	private String phone;
	
public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (int) age;
	}


	public static void main(String[] args) {

Encap p1=new Encap();
p1.setEid(1082);
p1.setUsername("vamsi");
p1.setAge(24);
p1.setPhone("vivo");

System.out.println("eid :" +p1.getEid());
System.out.println("username:"+p1.getUsername());
System.out.println("Age:"+p1.getAge());
System.out.println("phone:"+p1.getPhone());

	}
}
