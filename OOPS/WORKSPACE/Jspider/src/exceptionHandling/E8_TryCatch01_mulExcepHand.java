package exceptionHandling;

public class E8_TryCatch01_mulExcepHand {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int a = 10;
		int b = 0;
		int ans = 0;
		try {
			ans = a / b;
			System.out.println(ans);
			arr[5] = 100;

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException exp) {
			System.out.println("Exception Accures");

		}
	}

}
