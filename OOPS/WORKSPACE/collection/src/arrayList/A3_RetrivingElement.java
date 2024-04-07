package arrayList;

import java.util.ArrayList;

public class A3_RetrivingElement {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(500);
		al.add("test");
		al.add(562);
		al.add(null);
		al.add(54.23);
		
		//Access(retriving)  Element @ index 2
		
		int n = (int)al.get(2);  //Explicity  DownCast
		System.out.println("index 2 element is "+n);
		
	//Access(retriving)  Element @ index 4
		
		double d = (double)al.get(4);  //Explicity  DownCast
		System.out.println("index 4 element is "+d);
		
		
	}

}
