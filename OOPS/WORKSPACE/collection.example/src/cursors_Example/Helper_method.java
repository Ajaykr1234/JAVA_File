package cursors_Example;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper_method {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);

		Iterator itr1 = al.iterator();

		Object o1 = itr1.next();
		Object o2 = itr1.next();
		Object o3 = itr1.next();
		System.out.println(o1 + " " + o2 + " " + o3);
		Object o4 = itr1.next();
//		System.out.println(o4);  //NoSuchElementException

		while (itr1.hasNext()) {
			Object obj = itr1.next();
			System.out.println(obj);
		}

	}
}
