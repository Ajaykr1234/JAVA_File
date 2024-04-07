package classtype;


class test {
	static int x = 300;
	static double y = 400;
	static void disp() {
		System.out.println("i am test class display method running...........");
	}
}

class test1 {
	static int x = 562;
	static double y = 658;
	static void disp() {
		System.out.println("i am test1 class display method running...........");
	}
}

public class Demo3_StaticMember {
	static int x =100;
	static double y=200;
	static void disp() {
		System.out.println("i am demo3 class disp method ...");
	}
	public static void main(String[] args) {
		System.out.println("main method started ....");
		System.out.println("x vlaue of demo3 class "+x);      //with in the class to access static member 
		System.out.println("y vlaue of demo3 class"+y);
		disp();
		System.out.println("===========================================================");
		System.out.println("x vlaue of test class : "+test.x); //out side the class to access static member 
		System.out.println("y vlaue of test class : "+test.y);
		test.disp();
		System.out.println("===================After modifining the x and y value ============================");
		test.x=30000;
		test.y=40000;
		System.out.println("x vlaue of test class : "+test.x); //out side the class to access static member 
		System.out.println("y vlaue of test class : "+test.y);;
		System.out.println("main method Ended ....");
		
	}

}

