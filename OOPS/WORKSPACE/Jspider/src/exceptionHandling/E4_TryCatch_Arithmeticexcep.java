package exceptionHandling;

public class E4_TryCatch_Arithmeticexcep {
	
	public static void main(String[] args) {
		int a =10;
		int b=0;
		int ans =0;
		
		try {
			System.out.println("enter into try block");
			System.out.println("dividing"+a+" by "+b);
			ans=a/b;
			System.out.println("Existing try block ");
			
		} catch (ArithmeticException e) {
			System.out.println("Running catch block");
			System.out.println("can not a number  divided by 0");
			
		}
		System.out.println("Ans is "+ans);
	}

}
