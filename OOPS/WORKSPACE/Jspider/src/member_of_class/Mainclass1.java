package member_of_class;
class Demo1{
	static int x=10;
	static int y = 20;
	static void test() {
		System.out.println("Running test method ");
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		System.out.println("main method stated..");
		System.out.println(Demo1.x);
		System.out.println(Demo1.y);
		Demo1.test();
		System.out.println("after modification of x and y value ");
		Demo1.x=50;
		Demo1.y=60;
		System.out.println(Demo1.x);
		System.out.println(Demo1.y);
		System.out.println("main method ended ...");
		
	}

}
