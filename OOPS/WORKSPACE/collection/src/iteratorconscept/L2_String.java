package iteratorconscept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class L2_String {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String > als = new ArrayList<String>();
		als.add("java");
		als.add("python");
		als.add("c++");
		als.add(".net");
		als.add("html");
		als.add("css");
		
		
		System.out.println("=====using normal for loop======");
		
		for(int i=0; i<als.size(); i++) {
			System.out.println(als.get(i));
		}
		
		System.out.println("======using advance for loop=======");
		
		for(Object al : als) {
			System.out.println(al);
		}
		
		
		System.out.println("=====using iterator==================");
		
		Iterator<String> it = als.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("======using ListIterator in forward direction=======");
		
		ListIterator<String> lts = als.listIterator();
		while(lts.hasNext()) {
			System.out.println(lts.next());
		}
		
		
		
		
		System.out.println("========using ListIterator on backwaord direction=====");
		
		ListIterator< String> blt = als.listIterator();
		while(blt.hasPrevious()) {
			System.out.println(blt.previous());
		}
	}

	
	
}
