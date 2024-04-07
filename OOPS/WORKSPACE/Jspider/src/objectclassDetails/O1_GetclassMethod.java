package objectclassDetails;

class Demo1 {
	public Demo1() {

	}

}
//================

class Demo2 {
	public Demo2() {

	}
}

public class O1_GetclassMethod {

	public static void main(String[] args) {

		Object o1 = new Object();
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		O1_GetclassMethod og1 = new O1_GetclassMethod();

		System.out.println(o1.getClass());
		System.out.println(d1.getClass());
		System.out.println(d2.getClass());
		System.out.println(og1.getClass());
	}

}
