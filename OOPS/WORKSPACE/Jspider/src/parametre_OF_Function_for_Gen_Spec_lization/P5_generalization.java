package parametre_OF_Function_for_Gen_Spec_lization;

class Demo11 {

	int x = 100;

	void disp1() {
		System.out.println("I am disp of Demo 1 class");
	}

}

//=====================================================

class Demo22 extends Demo11 {

	int y = 200;

	void disp2() {
		System.out.println("I am disp of Demo 2 class");
	}

}

//=======================================================

class Demo33 extends Demo11 {

	int z = 300;

	void disp3() {
		System.out.println("I am disp of Demo 3 class");
	}

}

//==================================================
class OperationGen {

	// generalization code

	void operation3(Demo11 arg) {
		System.out.println("I am operation three ");
		System.out.println(arg.x);
		arg.disp1();
		System.out.println("=========================");
	}

	// how to find which class generalization is working (with the help in instance
	// of
	void operation4(Demo11 arg) {
		System.out.println("I am operation four");

		if (arg instanceof Demo11) {
			System.out.println("Given object is Demo11 class type");
		} else if (arg instanceof Demo22) {
			System.out.println("Given object is Demo22 class type");
		} else if (arg instanceof Demo33) {
			System.out.println("Given object is Demo33 class type");
		} else {
			System.out.println("x value is " + arg.x);
			arg.disp1();
		}
		System.out.println("=====================================");
	}

	// how to Access the specific properties of generalization
	// ans :- down casting but before dawncasting go through instance of

	void operation5(Demo11 args) {
		System.out.println("I am opration five running satate");

		if (args instanceof Demo11) {
			System.out.println("X value is " + args.x);
			args.disp1();
		} else if (args instanceof Demo22) {

			Demo22 ref = (Demo22) args;

			System.out.println("y value is " + ref.y);
		} else {
			Demo33 ref = (Demo33) args;
			System.out.println("z value is " + ref.z);
		}
		System.out.println("======================================`");
	}

}

public class P5_generalization {

	public static void main(String[] args) {

		Demo11 d11 = new Demo11();
		Demo22 d22 = new Demo22();
		Demo33 d33 = new Demo33();

		OperationGen opg = new OperationGen();

		// generalization
		opg.operation3(d11);
		opg.operation3(d22);
		opg.operation3(d33);

		// cheaking which class generalization is working
		opg.operation4(d11);
		opg.operation4(d22);
		opg.operation4(d33);

		// fecthing specific vlaue from generalization
		opg.operation5(d11);
		opg.operation5(d22);
		opg.operation5(d33);
		
	}
}
