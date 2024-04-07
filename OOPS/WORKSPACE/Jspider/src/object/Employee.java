package object;

class Employeee{
	int id;
	String name;
	double salary;
	
	void updateid(int newid) {
		System.out.println("updating id");
		id = newid;
		System.out.println(id);
	}
	void updatename(String newname) {
		System.out.println("updating name");
		name = newname;
		System.out.println(name);
	}
	void updatesalary(double newsalary) {
		System.out.println("updating salary");
		salary= newsalary;
		System.out.println(salary);
	}
}

public class Employee {
	public static void main(String[] args) {
		
		Employeee e1 = new Employeee();
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println("================================");
		e1.updateid(123);
		e1.updatename("Ram");
		e1.updatesalary(12354.36);
		
	}
	

	

}
