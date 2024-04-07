package arrayList;

import java.util.ArrayList;


public class A6_AccessUsingLoop {
	
	
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add(125);
		al.add(45.23);
		al.add(null);
		al.add("test");
		
		
		
		;
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			
		}
		System.out.println("========Access using for eachLoop============");
		for (Object element : al) {
			System.out.println(element);
			
		}
	}

}
