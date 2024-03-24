package oops;

public class Palindrome {
	static boolean isPalindrome(String str)
	{
		int i=0, j = str.length() -1;
		while (i>j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="vamsi";
		String str1  ="krishna";
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		System.out.println("string 1 :");
		if(isPalindrome(str))
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
		System.out.println();
		System.out.println("string2 :");
		if(isPalindrome(str1))
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
	}

}
