package stringclasses;

class calculator {

	private static calculator cal; //self refrence variable

	private calculator() {
		System.out.println("I am privte constructor ");
	}

	public void add(int a, int b) {
		System.out.println("Adding the a and b vlaue is " +( a + b));
	}
	
	public static calculator getinstance() {
		
		if(cal == null) {
		cal = new calculator();
		}
		return cal;
	}
}

public class S2_SingleTonClass {
	
	public static void main(String[] args) {
		
		calculator c1 =calculator.getinstance();
		c1.add(40, 40);
		
		
	
		
	}

}
