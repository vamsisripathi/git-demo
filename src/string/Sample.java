package string;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder s= new StringBuilder("krishna " );
s.append( "sripathi");
s.insert(0, "vamsi");
s.reverse();
s.replace(0, 3,"");
s.delete(0, 5);
s.ensureCapacity(10);
System.out.println(s.capacity());
	}

}
