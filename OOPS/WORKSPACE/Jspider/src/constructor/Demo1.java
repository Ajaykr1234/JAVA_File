package constructor;


class test{
	int x;
	int y;
	
	test(){
		System.out.println("Running test ");
		x=40;
		y=125;
	}
	
}
public class Demo1 {
	public static void main(String[] args) {
		test t1 = new test();
		System.out.println(t1.x);
		System.out.println(t1.y);
	}
	

}