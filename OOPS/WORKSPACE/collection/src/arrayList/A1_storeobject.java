package arrayList;

import java.util.ArrayList;
import java.util.Stack;

public class A1_storeobject {

	public static void main(String[] args) {
		System.out.println("main method Started ");
		
		ArrayList al = new ArrayList();
		
		al.add(100);  //Autoboxing and autoupcating
		
		al.add("test"); //String upcating to object type
		
		al.add(32.5); //Autoboxing and autoupcating
		
		al.add(null); //null upcasted to object type
		
		al.add(100);  //Autoboxing and autoupcating
		
		int size = al.size();
		System.out.println(" Total element in ArrayList "+size);
		
		System.out.println(al); //internaly call toString method
		
		
		System.out.println("main method ended ");
		
		
		
		
		
	}
}
