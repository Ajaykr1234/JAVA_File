package arrayList;

import java.util.ArrayList;

public class A5_replace {
	public static void main(String[] args) {
		
		

		ArrayList al = new ArrayList();
		
		al.add(125);
		al.add(45.23);
		al.add(null);
		al.add("test");
		
		System.out.println(al);
		System.out.println("replace element @ index 2");
		al.set(2, 123);
		System.out.println(al);
		
	}
	

}
