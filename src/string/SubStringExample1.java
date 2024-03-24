package string;

public class SubStringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[]= {
		"vamsi krishna",
		"jaya krishna",
		"rama krishna","prathap kumar","prveen kumar"
};
String surName="krishna";
int surNameSize=surName.length();
int size=str.length;
for(int j=0;j<size;j++) {
	int length=str[j].length();
	String subStr=str[j].substring(length-surNameSize);
	if (subStr.equals(surName))
	{
		System.out.println(str[j]);
	}
}
	}

}
