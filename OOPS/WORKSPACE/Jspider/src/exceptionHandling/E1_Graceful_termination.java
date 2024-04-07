package exceptionHandling;

public class E1_Graceful_termination {

	public static void main(String[] args) {
		System.out.println("main method stated");
		int a = 10;
		int b = 2;
		int div = a / b;
		System.out.println(div);
		System.out.println("main method started");
		
		
		Object o1 = new Object();
		System.out.println(o1.getClass());
		
		E1_Graceful_termination e1 = new E1_Graceful_termination();
		System.out.println(e1.hashCode());

	}

}
