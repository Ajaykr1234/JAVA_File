package referance_variable;


class operation1{
	int x = 100;
	void disp() {
		System.out.println("I am display function");
	}
}

//===================================

class operation2{
	int y = 4201;
	
	operation1 o1 = new operation1();
	void test() {
		System.out.println("i am test menthod");
		System.out.println(o1.x);
		o1.disp();
	}
}

public class R3_NonStaticVar {
	
	public static void main(String[] args) {
		
		operation2 o2 = new operation2();
		
		System.out.println(o2.y);
		o2.test();
		
		//Another way to fetch
		
		System.out.println(o2.o1.x);
		o2.o1.disp();
		
		
		
		
	}
	
	

}
