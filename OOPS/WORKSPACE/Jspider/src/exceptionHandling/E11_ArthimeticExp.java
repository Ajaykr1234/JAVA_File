package exceptionHandling;

public class E11_ArthimeticExp {

	public static void main(String[] args) {

		ArithmeticException e1 = new ArithmeticException();
		String mes = e1.getMessage();
		System.out.println(mes);
		
		ArithmeticException e2 = new ArithmeticException("hello i am excetion");
		System.out.println(e2.getMessage());
		

	}

}
