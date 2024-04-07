package exceptionHandling;

public class E5_TryCatch_ArithmeticArray {
	public static void main(String[] args) {
		int[] arr = new int[3];
		int a=10;
		int b=2;
		int ans=0;
		try {
			System.out.println("enter into try block");
			System.out.println("dividing"+a+" by "+b);
			ans=a/b;
			arr[3]=100;
			System.out.println("Exiting try block");
			
		} catch (ArithmeticException exp) {
			System.out.println("Running catch block");
			System.out.println("can not a number  divided by 0");
			
		}catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println("index with in the range");
		}
		System.out.println(ans);
	}

}
