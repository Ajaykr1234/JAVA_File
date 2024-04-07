package arrayList;

import java.util.ArrayList;

public class A4_Inserting {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(125);
		al.add(45.23);
		al.add(null);
		al.add("test");
		
		System.out.println(al);
		
		System.out.println("inserting element @ index 2");
		
		al.add(2, 500);
		
		System.out.println(al);
		
		
		
	}

}
