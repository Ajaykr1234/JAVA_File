package exceptionHandling;

public class E2_Force_termination {
	public static void main(String[] args) {
		System.out.println("main method started");
		int a=10;
		int b=2;
		int sum=a+b;
		System.out.println(sum);
		
		System.exit(0); //force termination code
		
		int div = a/b;
		System.out.println(div);
		System.out.println("main method ended");
	}

}
