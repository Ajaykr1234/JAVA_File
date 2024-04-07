package admin;

import repository.EmployeeDB;

public class Test {
	public static void main(String[] args) {
		EmployeeDB empdb= new EmployeeDB(3);
		Employee e1= Employee_Creation.create("ram",919977,100.00);
		Employee e2= Employee_Creation.create("ramaya",91945,500.00);
		Employee e4= Employee_Creation.create("ramu",9155977,6000.00);
		Employee e5= Employee_Creation.create("ramkrishna",914545,40000.00);
		empdb.addEmployee(e1);
		empdb.addEmployee(e2);
		empdb.addEmployee(e4);
		empdb.addEmployee(e5);
		
		empdb.viewEmployeeRecords();
		
		
		
		Employee e = empdb.getEmployee(1002);
		System.out.println(e);
		
		  
	}

}
