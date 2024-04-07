package linkedHashMap_Program;

import java.util.LinkedHashMap;

public class L2_Method {
	public static void main(String[] args) {
		LinkedHashMap<Character, String> l1 = new LinkedHashMap<Character, String>();

		l1.put('a', "Apple");
		l1.put('b', "Ball");
		l1.put('c', "Cat");
		l1.put('d', "Dog");
		System.out.println(l1.containsKey('a')); // true 
		//containsKey(key) ---------Return true if that key is present otherwise return false 
		System.out.println(l1.containsKey('e'));
		System.out.println(l1.containsKey('c'));
	}
}
