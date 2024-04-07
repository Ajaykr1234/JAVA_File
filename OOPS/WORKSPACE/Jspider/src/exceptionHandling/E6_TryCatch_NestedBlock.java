package exceptionHandling;

public class E6_TryCatch_NestedBlock {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int a=10;
		int b=2;
		int ans=0;
		try {
			System.out.println("entered outer try block");
			try {
				System.out.println("entered inner try block");
				ans=a/b;
				System.out.println("Ans "+a/b);
				System.out.println("exisiting inner try block");
				
			} catch (ArithmeticException exp) {
				System.out.println("We cannot divided by 0 to any number ");
			}
			
			arr[5]=10;
		} catch(ArrayIndexOutOfBoundsException exp){
			System.out.println("Array out of range");
		}
		
 }
}