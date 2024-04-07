package treeset;

import java.util.TreeSet;

public class T1_basic {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add(1);
		ts.add(3);
		ts.add(5);
		ts.add(4);
		ts.add(2);

		System.out.println(ts.size());
		System.out.println(ts);

		System.out.println("adding dublicate element ");
		ts.add(1);
		ts.add(3);
		ts.add(5);
		ts.add(4);
		ts.add(2);

		System.out.println(ts.size());
		System.out.println(ts);
	}

}
