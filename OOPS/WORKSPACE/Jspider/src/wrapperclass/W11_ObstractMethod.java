package wrapperclass;

public class W11_ObstractMethod {

	public static void main(String[] args) {

		Byte b1 = 100;
		byte b11 = b1.byteValue();

		Short s1 = 200;
		short s11 = s1.shortValue();

		Integer i1 = 300;
		int i11 = i1.intValue();

		Long l1 = 123304l;
		long l11 = l1.longValue();

		Float f1 = 223.5f;
		float f11 = f1.floatValue();

		Double d1 = 45.2;
		double d11 = d1.doubleValue();

		System.out.println(b11 + "\n" + s11 + "\n" + i11 + "\n" + f11 + "\n" + d11);

	}

}
