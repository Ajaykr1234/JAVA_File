package method_OvrRidLod_Chaining;

class A {
	void fun() {
		System.out.println(" happy happy happy ");
	}

	private void funmood() {
		System.out.println("hello every one ");
	}
}

class B extends A {
	@Override
	void fun() {
		System.out.println("Happy 3 times");
	}
	
//	@Override error we can not override the private member 
   private void funmood() {
		 
	}

//	@Override   error annotation error
	void display() {
		System.out.println("Diplay happy mood");
	}
}

public class Method_overriding {
	public static void main(String[] args) {

		B b = new B();

		b.fun();
//		b.funmood(); private member can not be inherte 
		b.display();
	}

}
