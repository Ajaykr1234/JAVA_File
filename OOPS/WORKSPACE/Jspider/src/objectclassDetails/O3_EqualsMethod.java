package objectclassDetails;

class Demo5 {
	@Override
	public int hashCode() {

		return 1234;
	}
}

//======================

class demo6 {
	@Override
	public int hashCode() {

		return 1234;
	}
}

public class O3_EqualsMethod {

	public static void main(String[] args) {
		O3_EqualsMethod e1 = new O3_EqualsMethod();
		Demo4 d4 = new Demo4();
		Demo5 d5 = new Demo5();

		System.out.println(e1.equals(d4));
		System.out.println(e1.equals(d5));
		System.out.println(e1.equals(e1));
		System.out.println(d5.hashCode()==d4.hashCode());
		System.out.println("===============================");

		System.out.println(d4.equals(e1));
		System.out.println(d4.equals(d5));
		System.out.println(d4.equals(d4));
		System.out.println("===============================");

		System.out.println(d5.equals(e1));
		System.out.println(d5.equals(d4));
		System.out.println(d5.equals(d5));

	}

}
