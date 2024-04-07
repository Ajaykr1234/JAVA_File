package parametre_OF_Function_for_Gen_Spec_lization;




class demone {
	int x = 40;
	int y = 100;
	
	demone(){

		
	}
	
	
    demone(int x ,int y){
    	this.x=x;
    	this.y=y;
    }
    
    
    
	void calculator() {
		System.out.println("i am a calculator ");
	}
}


//========================================================
class Sample {

	void test(demone arg) {
		System.out.println("Running test method");
		System.out.println(arg.x);
		System.out.println(arg.y);
		arg.calculator();
	}
}

//================================================
class Sample1 {

	void test1(demone arg) {
		System.out.println("Running test1 method");
		System.out.println(arg.x);
		System.out.println(arg.y);
		arg.calculator();
		arg.x = 500;
		arg.y = 800;
	}
}

//=================================================
class Sample2 {

	void test2(demone arg, int x, int y) {
		System.out.println("Running test2 method");
		System.out.println(arg.x);
		System.out.println(arg.y);
		arg.calculator();
		arg.x = x;
		arg.y = y;
	}
}

//=================================================

class Sample3 {

	demone test3() {
		
		System.out.println("Running test3 method");
		demone d3 = new demone();
		return d3;

		// return new demone();
	}
}

//=================================================

class Sample4{

	demone test4() {
		
		System.out.println("Running test4 method");
		demone d4 = new demone();
		return d4;
	}
}



//=================================================

class Sample5{

	demone test5(int x , int y ) {
		
		System.out.println("Running test5 method");
		demone d5 = new demone(x,y);
		return d5;
	}
}


//===================================================
public class P3_parametreNonPrimitiveTpes {

	public static void main(String[] args) {

		// 1st way
		Sample s = new Sample();
		s.test(new demone());

		System.out.println("============================================");
		// 2nd way
		demone d1 = new demone();
		s.test(d1);
		System.out.println(d1.x);
		System.out.println(d1.y);
		
		
		
		

		System.out.println("============================================");
		// re-intilize x and y value
		Sample1 s1 = new Sample1();
		s1.test1(d1);
		System.out.println(d1.x);
		System.out.println(d1.y);
		
		
		

		System.out.println("============================================");
		// re-intilize x and y value
		Sample2 s2 = new Sample2();
		s2.test2(d1, 142, 548);
		System.out.println(d1.x);
		System.out.println(d1.y);
		
		
		
		
		
		System.out.println("============================================");
		// with non primitive return type
		Sample3 s3 = new Sample3();
		demone d3=s3.test3();
		System.out.println(d3.x);
		System.out.println(d3.y);
		
		
		
		
		

		System.out.println("============================================");
		// with non primitive return type
		Sample4 s4 = new Sample4();
		demone d4=s4.test4();
		d4.x=852456;
		d4.y=951756;
		System.out.println(d4.x);
		System.out.println(d4.y);
		

		System.out.println("============================================");
		// with non primitive return type
		Sample5 s5 = new Sample5();
		demone d5=s5.test5(10000,2000);
		
		System.out.println(d5.x);
		System.out.println(d5.y);
		
	}

}

