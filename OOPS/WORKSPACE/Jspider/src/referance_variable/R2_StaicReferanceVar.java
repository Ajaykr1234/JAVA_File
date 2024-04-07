package referance_variable;


class Sample1{
	int x = 100;
	void disp() {
		System.out.println("this is display method");
	}
}

//=========================================

class Sample2{
	int y = 400;
	
	static Sample1 s1 = new Sample1();
	
	void test() {
		System.out.println("this is test method");
		System.out.println(s1.x);
		s1.disp();
	}
}


//=============================================

public class R2_StaicReferanceVar {
	
	public static void main(String[] args) {
		
		
		Sample2 s2 = new Sample2();
		System.out.println(s2.y);
		s2.test();
		
		//another wat to feth
		System.out.println(Sample2.s1.x);
		Sample2.s1.disp();
	}

}
