package referance_variable;

class demo1{
	int x = 10;
	void disp() {
		System.out.println("This is display method");
	}
}

//===================================\

class Demo2{
	int y = 200;
	
	void test() {
		demo1 d1 = new demo1();  //d1 is a local referance variable 
							//it means declaring a refreance varibale inside the function or method body kwon as local refreance varibale
		
		System.out.println(d1.x);
		d1.disp();
		System.out.println(y);
		
	}
}


//============================================

public class Local_referance_variable {
	
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.test();
		System.out.println(d2.y);
	}

}
