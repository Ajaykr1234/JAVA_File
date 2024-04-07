package objectclassDetails;

class Demo3 {

}

//=====================

class Demo4 {

	private static int myhasshcode = 12345;

	@Override
	public int hashCode() {
		return myhasshcode;
	}

}

//=====================

class Demo44 {

	private static int myhasshcode = 12345;

	@Override
	public int hashCode() {
		return myhasshcode;
	}

}

public class O2_HasCodeMethod {

	public static void main(String[] args) {

		Object o1 = new Object();
		Demo3 d3 = new Demo3();
		Demo4 d4 = new Demo4();
		Demo44 d44 = new Demo44();
		O2_HasCodeMethod oh = new O2_HasCodeMethod();

		System.out.println(o1);
		System.out.println(o1.hashCode());

		// hash code is not overridden in user class
		System.out.println(d3.hashCode());

		// hash code is overridden in user class
		System.out.println(d4.hashCode());

		System.out.println(oh);
		System.out.println(oh.hashCode());

		System.out.println("==============================");

		System.out.println(d44.hashCode());
		System.out.println(d4.equals(d44));
		System.out.println(d4);
		System.out.println(d44);
	}

}
