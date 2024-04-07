package arrayList;

import java.util.ArrayList;

public class A2_clearAllobject {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(500);
		al.add("test");
		al.add(32.45);
		
		System.out.println("Before removing all element is "+al);
		
		al.clear();
		
		System.out.println("after removing all the element is "+al);
		System.out.println(al.isEmpty());
	}

}
