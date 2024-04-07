package LinkedHashset;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class L1_basic {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add(1);
		lhs.add(4);
		lhs.add(2);
		lhs.add(5);
		lhs.add(3);

		System.out.println(lhs.size());
		System.out.println(lhs);
		
		System.out.println("Adding duplicate");
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);
		
		
		System.out.println(lhs.size());
		System.out.println(lhs);
		
		
	}

}
