package hashset;

import java.util.HashSet;

public class H1_Basic {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(100);
		hs.add(2.5);
		hs.add(4535886624785l);
		hs.add(true);
		hs.add(null);
		hs.add("ajay");
		hs.add("a");

		System.out.println("total size of hash set is " + hs.size());
		System.out.println(hs);

		System.out.println("Adding the dublicate element in hash set ");
		hs.add(100);
		hs.add(2.5);
		hs.add(4535886624785l);
		hs.add(true);
		hs.add(null);
		hs.add("ajay");
		hs.add("a");

		System.out.println("total size of hash set is " + hs.size());
		System.out.println(hs);

	}

}
