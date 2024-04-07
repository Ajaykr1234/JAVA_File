package member_of_class;

public class Demo2 {
	static int x =10;
	static void disp() {
		System.out.println("display method is runnong ");
	}

}


class Demo3{
	static void test() {
		System.out.println("test method running ");
		System.out.println(Demo2.x);
		Demo2.disp();
		System.out.println("After modification of the x value ");
		Demo2.x=100;
		System.out.println(Demo2.x);
	}
}
