package constructor;

class test4{
	int x=100;
	
	void display() {
		int x = 1235;
		System.out.println("local variable x value is "+x);
		System.out.println("non static member variable x value is "+this.x); //this is use to diff b/w local and member variable
		this.x=x;
		System.out.println(this.x);
	    x = this.x;
	    System.out.println(x);
	}
}


public class Demo4 {
public static void main(String[] args) {
	test4 t4 = new test4();
	t4.display();
}
}
