package oops;

public class ConstroctorOverloading {
	int id=1082;
	String name="vamsikrishna";
	float  salary=12000;
	ConstroctorOverloading()
	{
	}
	ConstroctorOverloading(int a){
		
	}
	ConstroctorOverloading(int b,int c){
	}

	public static void main(String[] args) {
		ConstroctorOverloading c1= new ConstroctorOverloading();
		ConstroctorOverloading c2= new ConstroctorOverloading();
		ConstroctorOverloading c3= new ConstroctorOverloading();
		System.out.println(c1.id+""+'\n'+c2.name+'\n'+c3.salary);

	}

}
