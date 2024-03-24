package string;

public class StringFormatExample {

	public static void main(String[] args) {
String name="12";

String sf1=String.format("name is %s ,",name);
String sf2=String.format("value is %f",36.22222);
String sf3=String.format("value is %36.12f",36.222222);
System.out.println(sf1);
System.out.println(sf2);
System.out.println(sf3);
	}

}
