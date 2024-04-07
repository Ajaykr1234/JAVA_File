package arrayList_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class A2_UnionOfString {

	public static void main(String[] args) {

		// Q2. make a union of the String of Array

		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			String ele = sc.next();
			al.add(ele);
		}
		int m = sc.nextInt();
		for (int i = 0; i <= m; i++) {
			String ele = sc.next();
			al2.add(ele);
		}
		
		LinkedHashSet<String> s1 = new  LinkedHashSet<String>(al);
		
		for (String str : al2) {
			s1.add(str);
		}
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*
		 * ArrayList<String> al = new ArrayList<String>(); al.add("Rohit");
		 * al.add("Subham"); al.add("virat"); al.add("Ishan");
		 * 
		 * ArrayList<String> al2 = new ArrayList<String>(); al2.add("Sharma");
		 * al2.add("Gill"); al2.add("Khohli"); al2.add("Kishan");
		 * 
		 * ArrayList<String> al3 = new ArrayList<String>(); for (int i = 0; i <
		 * al.size(); i++) { al3.add(al.get(i));
		 * 
		 * } for (int j = 0; j < al2.size(); j++) {
		 * 
		 * al3.add(al2.get(j));
		 * 
		 * } System.out.println(al3);
		 */
	}

}
