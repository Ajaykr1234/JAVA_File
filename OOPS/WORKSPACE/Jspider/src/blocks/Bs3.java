package blocks;

public class Bs3 {
	
	static int a=10;
			int b=30;
			
			static {
				System.out.println("static block");
				System.out.println(a);
				a=100;
//				System.out.println(b);
//				b=300;
//				inside static block we can access or reinsilization only static var
			}
	
	public static void main(String[] args) {
		
		System.out.println("main method started..");
		System.out.println(a);
	}
}
