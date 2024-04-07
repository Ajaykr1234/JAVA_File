package treeset;

import java.util.Enumeration;
import java.util.TreeSet;

public class T3_empmain {

	public static void main(String[] args) {

		TreeSet<T2_emp> emp = new TreeSet<T2_emp>();
		T2_emp t1 = new T2_emp(1, "ajay");

		T2_emp t2 = new T2_emp(3, "ajay");
		T2_emp t3 = new T2_emp(4, "ajay");

		T2_emp t4 = new T2_emp(2, "ajay");
		emp.add(t1);
		emp.add(t2);
		emp.add(t3);
		emp.add(t4);

		for (T2_emp e : emp) {
			System.out.println(e);
		}
	}
	
	

}
