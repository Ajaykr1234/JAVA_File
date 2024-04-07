package hashset;

import java.util.HashSet;

public class H3_EmpTest {

	public static void main(String[] args) {

		HashSet<H2_Employeee> HS = new HashSet<H2_Employeee>();

		H2_Employeee e1 = new H2_Employeee(0, "ajay", 123);
		H2_Employeee e2 = new H2_Employeee(1, "raja", 61452);
		H2_Employeee e3 = new H2_Employeee(2, "kamlesh", 452048);
		H2_Employeee e4 = new H2_Employeee(0, "ajay", 123);

		H2_Employeee e5 = new H2_Employeee(123, "ram", 24500);
		H2_Employeee e6 = new H2_Employeee(123, "ram", 24500);

		HS.add(e1);
		HS.add(e2);
		HS.add(e3);
		HS.add(e4);
		HS.add(e5);
		HS.add(e6);

		System.out.println(e1.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		System.out.println(e6.hashCode());
		System.out.println(" Totall Employee " + HS.size());

		System.out.println("id" + "\t" + "name" + "\t" + "salary");
		for (H2_Employeee h2 : HS) {
			System.out.println(h2.getId() + "\t" + h2.getName() + "\t" + h2.getSalary());
		}

	}

}
