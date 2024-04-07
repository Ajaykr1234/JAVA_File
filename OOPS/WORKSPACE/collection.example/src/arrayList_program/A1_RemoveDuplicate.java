package arrayList_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class A1_RemoveDuplicate {
	public static void main(String[] args) {

		// Q1. Remove the duplicate from ArrayList

		ArrayList<Integer> l1 = new ArrayList<Integer>();

		l1.add(40);
		l1.add(40);
		l1.add(40);
		l1.add(20);
		l1.add(20);

		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>(l1); // converting one list to another

		ArrayList<Integer> ans = new ArrayList<Integer>(s1);

		System.out.println(ans);

		/*
		 * ArrayList al = new ArrayList();
		 * 
		 * al.add(40); al.add(40); al.add(40); al.add(20); al.add(20); ArrayList al2 =
		 * new ArrayList(); for (int i = 0; i < al.size(); i++) { for (int j = i+1; j <
		 * al.size(); j++) { if(al.get(i)==al.get(j)) { al2.add(al.remove(i)); }
		 * 
		 * }
		 * 
		 * } System.out.println(al2);
		 */
	}

}
