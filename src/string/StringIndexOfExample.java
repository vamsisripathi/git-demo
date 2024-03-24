package string;

public class StringIndexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="this is vamsi sripathi";
int index1=s1.indexOf("is vamsi");
int index2=s1.indexOf("sripathi");
System.out.println(index1+" "+index2);
int index3=s1.indexOf("is",4);
System.out.println(index3);
int index4=s1.indexOf('s');
System.out.println(index4);
int index=s1.indexOf('e',12);
System.out.println("index of char "+index);
int index5=s1.indexOf("method",20);
System.out.println("index of substring"+index5);
	}

}
