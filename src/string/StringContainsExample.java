package string;

public class StringContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="vamsi krishna";
String s2="sripath";
String s3="he is the king";
System.out.println(s1.contains("vamsi"));
System.out.println(s1.contains("krishna"));
System.out.println(s1.contains("sripathi"));
boolean isContains=s2.contains("vamsi");
System.out.println(isContains);
System.out.println(s1.contains("vamsi"));
if(s3.contains(s3)) {
	System.out.println("he is the king");
	}
else {
		System.out.println("result not found");
		String s4="always";
		if(s4.contains(s4)) {
			System.out.println("in side the block");
		}
		else {
			System.out.println("inside the lese block");
		}
	}
}
	}


