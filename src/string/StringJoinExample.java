package string;

public class StringJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String joinString=String.join(" ","vamsi","krishna","sripathi");
System.out.println(joinString);
String date =String.join("/","26","02","1999");
System.out.println(date);
String time=String.join(":","02","33","AM");
System.out.println(""+time);
String str=null;
str=String.join("-","wakeup","eat","practiced java","sleep");
System.out.println(str);
	}

}
