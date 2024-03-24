package string;

import java.util.Locale;

public class StringUpperCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="vamsi krishna";
String supper=s.toUpperCase();
System.out.println(supper);
String turkish=s.toUpperCase(Locale.forLanguageTag("tr"));
System.out.println(turkish);
String eng=s.toUpperCase(Locale.forLanguageTag("en"));
System.out.println(eng);
	}

}
