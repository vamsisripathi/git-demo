package oops;

 class Display {

		public void z1() {
			System.out.println("welcome to opps concept");
		}
}
 class Singles extends Display{
		public void Show() {
				System.out.println("wellcome");	

				}
	
			}
		
class Three extends Singles{
	
	public void z5() {
		System.out.println("close");
	}
}
 
 public class Single {

		public static void main(String[] args) {
			Three s1 = new Three();			
			s1.Show ();
			s1.z1 ();
			s1.z5();
			
		}
 }
			
		
 


	 
	 
