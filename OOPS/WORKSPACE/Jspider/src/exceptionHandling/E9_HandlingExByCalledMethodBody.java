package exceptionHandling;

class calculator {

	void divid(int numerator, int denomerator) {

		double ans = 0;
		System.out.println("Divideing " + numerator + " by " + denomerator);

		try {
			ans = numerator / denomerator;

		} catch (ArithmeticException e) {
			System.err.println("we can deivid ant number by zero");
		}
		System.out.println("ans is :" + ans);
	}
}

public class E9_HandlingExByCalledMethodBody {

	public static void main(String[] args) {

		calculator c = new calculator();
		c.divid(40, 0);

	}
}
