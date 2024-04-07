package parametre_OF_Function_for_Gen_Spec_lization;


class Demo1 {
	
	int x = 100;
	void disp1() {
		System.out.println("I am disp of Demo 1 class");
	}

}

//=====================================================

class Demo2 extends Demo1 {
	
	int y = 200;
	void disp2() {
		System.out.println("I am disp of Demo 2 class");
	}

}

//=======================================================

class Demo3 extends Demo1 {
	
	int z = 300;
	void disp3() {
		System.out.println("I am disp of Demo 3 class");
	}

}



//==================================================
class Operationclass {
	
	//specialization code (when we use subclass type reference variable then we achieve specialization )
	void operation1(Demo2 arg) {
		System.out.println("I am operation one ");
		System.out.println(arg.x);
		arg.disp1();
		System.out.println(arg.y);
		arg.disp2();
		System.out.println("=========================");
		
	}
	
	//specialization code (when we use subclass type reference variable then we achieve specialization )
	void operation2(Demo3 arg) {
		System.out.println("I am operation two ");
		System.out.println(arg.x);
		arg.disp1();
		System.out.println(arg.z);
		arg.disp3();
		System.out.println("=========================");
	}
	
	

	
}



public class P4_specialization {
	
	public static void main(String[] args) {
		
		
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		Operationclass s1 = new Operationclass();
		
		//specilization 
		s1.operation1(d2);
		s1.operation2(d3);
		
		/* 	s1.operation1(d1);
			s1.operation1(d2);
			s1.operation1(d3);	*///not possible except d2
		
		 /*	s1.operation2(d1);
			s1.operation2(d2);
			s1.operation2(d3);	*///not possible except d3
		
		
		
	}

}
