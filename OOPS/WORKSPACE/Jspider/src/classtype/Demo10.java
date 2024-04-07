package classtype;
class test10{
	int x = 100;
	double y = 200.23;
	
}
public class Demo10 {
	public static void main(String[] args) {
		System.out.println("main method started ...................");
		
		test10 t10 = new test10();
		test10 t11 = t10;
							///for one object we can assign many reference variable that mean t10 and t11 assign to one obj
		
		System.out.println(" x value for t10 "+t10.x);
		System.out.println(" y value for t10 "+t10.y);
		System.out.println(" x value for t11 "+t11.x);
		System.out.println(" y value for t11 "+t11.y);
		
		System.out.println("======================================");
		t10.x=1256;
		System.out.println(" x value for t10 "+t10.x);
		System.out.println(" x value for t11 "+t11.x);
		
		System.out.println("======================================");
		t11.y=4586.362;
		System.out.println(" y value for t10 "+t10.y);
		System.out.println(" y value for t11 "+t11.y);
	}

}
