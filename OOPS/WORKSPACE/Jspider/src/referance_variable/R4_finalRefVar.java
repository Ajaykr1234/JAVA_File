package referance_variable;


class operation{
	int x = 10;
	void test() {
		System.out.println("I am a test ");
	}
	
}

class sampl{
	int y = 100;
	final operation op = new operation();
	
	void desp() {
		System.out.println("Display method is running ");
	}
}

public class R4_finalRefVar {
	
	public static void main(String[] args) {
		
		sampl s1 = new sampl();
		
		System.out.println(s1.op.x);
		s1.op.test();
		
		s1= new sampl();
		
//		s1.op= new sampl();  //it can not be possble due to final key word
		
		
	}

}
