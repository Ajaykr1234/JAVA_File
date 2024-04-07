package exceptionHandling;

public class E8_TryAndFinally {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		} finally {
			System.out.println("I am always be ready to run");
		}
	}

	
	//exception is not handled jvm always run finally
}
