package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class A8_StoringDiffObject {

	public static void main(String[] args) {

		Pen p = new Pen("ballpen", "cello", 10);

		Employee e = new Employee(1, "Ram", 45000);

		Book b = new Book("java", "GamesGosling", 800);

		Student s = new Student("ajay", 1, 89.9);

		Food f = new Food("panner", "namaste", 150);

		ArrayList al = new ArrayList();

		al.add(p);

		al.add(e);

		al.add(b);

		al.add(s);

		al.add(f);

		System.out.println(al.size());

		for (Object ob : al) {
			System.out.println(ob);

		}

		System.out.println("====================================");

		
		
		
		

			}

}
