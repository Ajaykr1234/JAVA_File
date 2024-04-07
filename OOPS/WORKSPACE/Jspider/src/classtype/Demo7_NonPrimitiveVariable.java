package classtype;
class Demo77{
	int x = 100;
	void test() {
		System.out.println("test method ");
	}
}
public class Demo7_NonPrimitiveVariable {

	public static void main(String[] args) {
		Demo77 d77; //Reference  variable declaration //_NonPrimitiveVariable
		
		d77 = new Demo77(); // Assigning object to Reference  variable //_NonPrimitiveVariable
		System.out.println(d77.x);
		d77.test();
	}
}
