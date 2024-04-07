package iteratorconscept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Queue;

public class I1_traverting {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(45);
		al.add(65);
		al.add(95);
		al.add(85);
		al.add(75);
		al.add(55);

		Iterator it = al.iterator();

		System.out.println(it.next());

		System.out.println(it.next());
		System.out.println(it.next());

		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

//		System.out.println(it.next());

//		the overcome we can go through while loop

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
