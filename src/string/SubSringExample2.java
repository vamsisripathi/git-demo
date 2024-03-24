package string;

public class SubSringExample2 {
	 boolean isPalindrome(String str) {
		int size=str.length();
		if(size==0||size==1) {
			return true;
		}
		String f=str.substring(0, 1);
		String l=str.substring(size-1);
		if(l.equals(f)) {
			return isPalindrome(str.substring(1, size-1));
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SubSringExample2 s1= new SubSringExample2();
String str[]= {"madam","mom","noon","king","nuvada"};
int size =str.length;
for(int j=0;j<size;j++) {
	if(s1.isPalindrome(str[j])) {
		System.out.println(str[j]+"is palindrome");
	}
	else {
		System.out.println(str[j]+"is not palindrome");
	}

	
	}

}
}