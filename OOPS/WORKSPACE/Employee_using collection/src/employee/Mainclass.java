package employee;

import java.util.ArrayList;

public class Mainclass {
	
	public static void main(String[] args) {
		
		Employee e1= new Employee(123, "Ram", 1000, 2301, "a123");
		Employee e2= new Employee(123, "Ramesh", 2000, 2401, "a124");
		Employee e3= new Employee(123, "Ramya ", 3000, 2501, "a125");
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		double max = al.get(0).getEsal();
		for (Employee emp : al) {
			if(max<emp.getEsal()) {
				max=emp.getEsal();
			}
		}
		
		for (Employee emp1 : al) {
			if(max==emp1.getEsal()) {
				System.out.println(emp1);
			}
		}
	
	}

}
