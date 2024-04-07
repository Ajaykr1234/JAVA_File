package Zexam;


class Calculator{
	
	public  void add( int a , int b) {
		System.out.println(a+b);
	}
	
	public  void add( double a , int b) {
		System.out.println(a+b);
	}
	
	public  void add( int a , double b) {
		System.out.println(a+b);
	}
}

public class CompileTimePoly {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.add(5, 0);
		c.add(.25, 0);
		c.add(0, 0.458);
	}
	

}
