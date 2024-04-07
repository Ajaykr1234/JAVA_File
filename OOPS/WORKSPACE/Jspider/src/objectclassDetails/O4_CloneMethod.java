package objectclassDetails;

class Employee implements Cloneable {

	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
//===================================================

class student {
	String name;
	String batchcode;

	public student(String name, String batchcode) {
		this.name = name;
		this.batchcode = batchcode;
	}
}

//=====================================================

public class O4_CloneMethod {

	public static void main(String[] args) {

		try {
			Employee e1 = new Employee("raja", 123.125);
			Employee e2 = (Employee) e1.clone();

			System.out.println(e1.name + "    " + e1.salary);
			System.out.println(e2.name + "    " + e2.salary);

			System.out.println(e1.hashCode());
			System.out.println(e2.hashCode());

			System.out.println(e1.equals(e2));

			System.out.println("==================================");
			student s1 = new student("ajay", "jsp123");
			student s2 = s1;
			System.out.println(s1.name + "   " + s1.batchcode);
			System.out.println(s1.name + "   " + s1.batchcode);

			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());

			System.out.println(s1.equals(s2));

		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}

	}

}
