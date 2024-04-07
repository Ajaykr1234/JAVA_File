package classtype;
class Demo99{
	int x = 100;
	double y = 200;
}
public class Demo9 {
	public static void main(String[] args) {
		System.out.println("main method started..............");
		Demo99 d99 = new Demo99(); 
		System.out.println(d99);
		d99.x=123;
		d99.y=568;
		
		d99 = new Demo99();
		
		System.out.println(d99);
		System.out.println("x value is "+d99.x);
		System.out.println("y value is "+d99.y);
		
		// here java automatic delete garbage collector 
		//here d99 ref var have two obj 
	}

}
