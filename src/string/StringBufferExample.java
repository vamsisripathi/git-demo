package string;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s=new StringBuffer("wellcome to nellore");
s.append("city");
System.out.println(s);
System.out.println(s.capacity());
s.replace(0, 11,"great");
System.out.println(s);
s.insert(0, "heartly");
System.out.println(s);
System.out.println(s);
s.reverse();
System.out.println(s);
	}

}
