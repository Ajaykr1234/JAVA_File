package linkedHashMap_Program;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class L1_Mainclass {
	public static void main(String[] args) {

		LinkedHashMap<Character, String> l1 = new LinkedHashMap<Character, String>();

		l1.put('a', "Apple");
		l1.put('b', "Ball");
		l1.put('c', "Cat");
		l1.put('d', "Dog");
		System.out.println(l1);
		System.out.println("==============================");
		
		Set onlykey = l1.keySet();
		System.out.println(onlykey);
		System.out.println("==============================");
		
		Collection onlyvalues = l1.values();
		System.out.println(onlyvalues);
		System.out.println("==============================");
		
		
		for (Character ele : l1.keySet()) {
			System.out.println(l1.get(ele));
		}
		System.out.println("==============================");

	}
}