package hashMap_program;

import java.util.HashMap;

public class H1_Mainclass1 {

	public static void main(String[] args) {
		
		HashMap h1 = new HashMap();  			//default capacity = 16 and default load factor = 0.75
		HashMap h2 = new HashMap(100); 			//initial capacity = 100 and default load factor = 0.75
		HashMap h3 = new HashMap(100, 09f); 	//initial capacity = 100 and  load factor = 0.90

		h1.put(123, "test");
		h1.put(12.56, true);
		h1.put(false, null);
		h1.put('t', 1452);

		int n = h1.size();
		System.out.println("total element in Hash Map " + n);
		System.out.println(h1);

		Object o1 = h1.get('t');
		System.out.println("values accociate to t is " + o1);

		System.out.println("Adding duplicate in hash map");
		h1.put('t', "tiger");
		System.out.println(h1);

	}

}
