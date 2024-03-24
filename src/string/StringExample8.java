package string;

public class StringExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="vamsi";
		int size=str.length();
		System.out.println("reverse of string:"+""+str+""+"is");
		for (int i=0;i<size;i++)
		{	

			System.out.println(str.charAt(str.length()-i-1));
		}
	}
		
	}


