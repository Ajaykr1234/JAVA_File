package hashmap;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Vector;

public class h1_basic {

	public static void main(String[] args) {

		HashMap hmap = new HashMap();

		hmap.put(1, 123);
		hmap.put(1.2, 12.023);
		hmap.put(false, null);
		hmap.put("e", "employee");

		System.out.println(hmap.size());

		System.out.println(hmap);

		Object o1 = hmap.get("e");
		System.out.println(o1);

		System.out.println("adding dublicate element");
		hmap.put(1, 123);
		hmap.put(1.2, 12.023);
		hmap.put(false, null);
		hmap.put("e", "employee");

		System.out.println(hmap.size());

		System.out.println(hmap);
	
	}

}
