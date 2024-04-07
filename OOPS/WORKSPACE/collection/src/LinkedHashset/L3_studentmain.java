package LinkedHashset;

import java.util.LinkedHashSet;

public class L3_studentmain {

	public static void main(String[] args) {

		LinkedHashSet<L2_Student> stu = new LinkedHashSet<L2_Student>();

		L2_Student l2 = new L2_Student(1, "ajay");
		L2_Student l3 = new L2_Student(2, "ajay");
		L2_Student l4 = new L2_Student(2, "ram");
		L2_Student l5 = new L2_Student(1, "ajay");

		stu.add(l2);
		stu.add(l3);
		stu.add(l4);
		stu.add(l5);

		for (L2_Student s : stu) {
			System.out.println(s);
		}

		// it also compare with hash code before adding the element

		System.out.println(l2.hashCode());
		System.out.println(l3.hashCode());
		System.out.println(l4.hashCode());
		System.out.println(l5.hashCode());
	}

}
