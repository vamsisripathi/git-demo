package oops;

public class AmstrongnumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count=0,a,b,c,sum=0;
		System.out.println("amstrong number from 1 to 1000:");
		for(int i=1; i<=1000;i++) {
			n=i;
			while(n>0) {
				b=n%10;
				sum=sum+(b*b*b);
				n=n/10;
			}
			if(sum==i) {
				System.out.println(i+"");
			}
			sum=0;
		}
	}
	

}
