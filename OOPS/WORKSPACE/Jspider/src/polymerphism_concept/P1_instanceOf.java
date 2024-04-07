package polymerphism_concept;

class Demo1 {
	int x = 10;

	static void disp1() {
		System.out.println("i am demo classs 1 display method");
	}
}

class Demo2 extends Demo1 {
	int xy = 20;

	static void disp2() {
		System.out.println("i am demo classs 2 display method");
	}
}

class Demo3 extends Demo2 {
	int xyz = 30;

	static void disp3() {
		System.out.println("i am demo classs 3 display method");
	}
}

public class P1_instanceOf {

	public static void main(String[] args) {

		Demo3 d3 = new Demo3();
		Demo2 d2 = d3;
		
		Demo1 d1 = d3;

		System.out.println(d3);

		System.out.println(d3 instanceof Demo1);
		System.out.println(d3 instanceof Demo2);
		System.out.println(d3 instanceof Demo3);// to cheak the is-a realationship

	}

}
