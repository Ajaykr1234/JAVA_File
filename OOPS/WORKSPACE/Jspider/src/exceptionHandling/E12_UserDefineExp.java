package exceptionHandling;

class MyException extends ArithmeticException {

	public MyException(String message) {
		super(message);
	}

}

public class E12_UserDefineExp {

	public static void main(String[] args) {

		MyException exp = new MyException("Invalid Exception");
		String message = exp.getMessage();

		System.out.println(message);
	}

}
