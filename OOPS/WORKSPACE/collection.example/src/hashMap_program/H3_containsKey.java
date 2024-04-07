package hashMap_program;

import java.util.HashMap;
import java.util.Set;

public class H3_containsKey {
	public static void main(String[] args) {
		HashMap<Character,String> h1 = new HashMap<Character,String>();
		h1.put('a', "aeroplane");
		h1.put('b', "aeroplane");
		h1.put('c', "aeroplane");
		
		System.out.println(h1.containsKey('a')); // true 
		//containsKey(key) ---------Return true if that key is present otherwise return false 
		System.out.println(h1.containsKey('d'));
		System.out.println(h1.containsKey('c'));
		
		System.out.println("=================================================================");
       
	}

}
