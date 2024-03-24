package oops;
abstract class bank{
	abstract int getRateOfinterest();
}
class SBI extends bank{
	int getRateOfinterest() {return 2;}						
	}
	class HDFC extends bank{
		int getRateOfinterest() {return 3;}
		}
		class CANARA extends bank{
			int getRateOfinterest() {return 7;}				
			}
			class ICICI extends bank{
				int getRateOfinterest() {return 4;}			
	}
	
public class Interest {

	public static void main(String[] args) {
		bank b;
		b=new SBI();
		System.out.println("Rate of interest is "+b.getRateOfinterest()+"%");
		b=new HDFC();
		System.out.println("Rate of interest is "+b.getRateOfinterest()+"%");
		b=new CANARA();
		System.out.println("Rate of interest is "+b.getRateOfinterest()+"%");
		b=new ICICI();
		System.out.println("Rate of interest is "+b.getRateOfinterest()+"%");
		
	}
}


	


