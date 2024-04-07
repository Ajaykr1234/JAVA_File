package exceptionHandling;

public class E14_CheakingThrowableObject {

	public static void main(String[] args) {
		Object obj = new Object();

		ArithmeticException exp = new ArithmeticException();

		ArrayIndexOutOfBoundsException arx = new ArrayIndexOutOfBoundsException();

		MyException myex = new MyException("Invaild");

		myArrayIndexoutofbond myax = new myArrayIndexoutofbond("out of bond");

		System.out.println(obj instanceof Throwable);
		System.out.println(exp instanceof Throwable);
		System.out.println(arx instanceof Throwable);
		System.out.println(myex instanceof Throwable);
		System.out.println(myax instanceof Throwable);

	}

}
