import java.util.Scanner;
public class LeapYearExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
System.out.println("enter year :");
Scanner sc= new Scanner(System.in);
year =sc.nextInt();
if(((year%4==0)&&(year%100!=0)))
	System.out.println("the given year leap year");
	else
		System.out.println("it is not a leap year");
}
	}


