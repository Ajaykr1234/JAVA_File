package exceptionHandling;

class myArrayIndexoutofbond extends ArrayIndexOutOfBoundsException {

	public myArrayIndexoutofbond(String outofbond) {
		super(outofbond);
	}
}

public class E13_UserDefiExp {

	public static void main(String[] args) {



		try {

			throw new MyException("ArrayIndexOutOfBond plase insert with in range");

		} catch (myArrayIndexoutofbond exp) {
			System.out.println("caught");

			System.out.println(exp.getMessage());
		}
	}

}

