package objectclassDetails;

class Sample1{
	
}

//========================
class Sample2{
	
	@Override
	public String toString() {
		
		return "this is overidden to sting method";
	}
}

public class O5_toStringMethod {
	
	public static void main(String[] args) {
		
		
		Object o1 = new Object();
		System.out.println(o1);
		
		Sample1 s1 = new Sample1();
		System.out.println(s1);
		
		Sample2 s2 = new Sample2();
		System.out.println(s2);
		s2.toString();
	}

}
