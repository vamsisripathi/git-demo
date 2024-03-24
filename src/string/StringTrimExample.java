package string;

public class StringTrimExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1="  vamsi    krishna   sripathi";
 System.out.println(s1);
 System.out.println(s1.trim());
 System.out.println(s1.length());
 System.out.println(s1);
 String tr=s1.trim();
 System.out.println(tr.length());
 System.out.println(tr);
 if(s1.trim().length()>0) {
	 System.out.println("the string contains characters\n");
 }
 else {
	 System.out.println("the string contains only white spaces");
 }
	}

}
