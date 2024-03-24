package string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
String s1="hi";
String s2 = "java";
System.out.println(s1+" "+s2);
System.out.println(s1==s2);
String s3 = new String();
System.out.println(s3);
String s4= new String("vamsi");
System.out.println(s4);
char ch[]= {'a','s','b'}; // here we using the char method
String s5=new String(ch);
System.out.println(s5);
String s6=String.valueOf(a); // here we using the method
System.out.println(s6);
	}

}
