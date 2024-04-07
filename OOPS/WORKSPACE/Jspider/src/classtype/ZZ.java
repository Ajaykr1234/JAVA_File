package classtype;

class Singlton{
	
	private static Singlton ton;
	
	private Singlton() {
		System.out.println("Creating a singlton object");
	}
	public void test() {
		System.err.println("This is fghjkl;");
	}
	
	public static Singlton getInstance() {
		if(ton==null) {
			ton = new Singlton();
		}
		return ton;
	}
}

public class ZZ {
	public static void main(String[] args) {
		
		Singlton t = Singlton.getInstance();
		t.test();
	}
	
	

}
