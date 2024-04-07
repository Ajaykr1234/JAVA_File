package wrapperclass;

public class W1_Integer {

	public static void main(String[] args) {

		Integer i1 = new Integer(401);// boxing operation
		Integer i2 = new Integer(501);// boxing operation

		int n1 = i1.intValue();
		int n2 = i2.intValue(); // unboxing operation

		int res = n1 + n2;

		Integer i3 = new Integer(res);
		System.out.println(i3);

		
		
		
		
		System.out.println("===After java 1.5 java introduce auto boxing and unboxing operation ====");

		Integer A1 = 100;
		Integer A2 = 102;

		System.out.println(A1 > A2);
		System.out.println(A2 > A1); // auto boxing and un-boxing

		int result = A1 + A2;
		// int result = A1.intValue()+A2.intValue()
		System.out.println(result);

		Integer result1 = A1 + A2;
		// Integer result1 = new Integer(A1.intValue()+A2.intValue())
		System.out.println(result1);

	}

}
