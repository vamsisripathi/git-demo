package string;

public class CapasityExample {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());
		s.append("helloneelima");
		System.out.println(s.capacity());
		s.append("hi this is vamsikrishna sripathi");
		System.out.println(s.capacity());

	}

}
