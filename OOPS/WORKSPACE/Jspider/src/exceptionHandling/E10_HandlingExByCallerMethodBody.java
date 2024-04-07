package exceptionHandling;

class Divcal {

	void divid(int a, int b) {
		System.out.println("Dividing " + a + " by " + b + " ans is : " + a / b);
	}

}

public class E10_HandlingExByCallerMethodBody {

	public static void main(String[] args) {

		Divcal d1 = new Divcal();

		try {
			d1.divid(10, 2);
			d1.divid(10, 0);
		} catch (ArithmeticException exp) {
			System.err.println("We can not divid by zero");
		}
	}

}
