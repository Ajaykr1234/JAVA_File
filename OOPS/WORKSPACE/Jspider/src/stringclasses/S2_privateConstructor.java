package stringclasses;

class Demo2 {

	private Demo2() {
		System.out.println("i am private cons");
	}

	public static Demo2 getInstance() {
		System.out.println("Enter to the getInstance ");

		Demo2 d2 = new Demo2();

		return d2;
	}
}

public class S2_privateConstructor {

	public static void main(String[] args) {

		Demo2 d21 = Demo2.getInstance();
		Demo2 d22 = Demo2.getInstance();

		System.out.println(d21);
		System.out.println(d22);
	}

}
