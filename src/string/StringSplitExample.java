package string;

public class StringSplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "vamsi krishna sripathi";
String[] words=s.split("\\s");
for(String w:words) {
	System.out.println(w);
	String str="sripathi";
	String[] arr=str.split("t",0);
	for(String w1: arr) {
		System.out.println(w1);
	}
	System.out.println("split array length:"+arr.length);
}
	}

}
