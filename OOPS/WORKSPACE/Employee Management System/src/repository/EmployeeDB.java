package repository;

import admin.Employee;

public class EmployeeDB {
	
	private Employee[] empdb;
	
	private int index=0;
	
	
	public EmployeeDB(int size) {
		empdb = new Employee[size];
	}
	
	
	
	public void addEmployee(Employee e) {
		if(index < empdb.length) {
			empdb[index++]=e;
			System.out.println("Employee added successsfully");
		}else {
			System.out.println("Database is full,can not add emlpoyee");
		}
	}
	
	
	
	public void viewEmployeeRecords() {
		System.out.println("ID\tNAME\tNUMBER\tSALARY");
		System.out.println("===================================");
		for(Employee e: empdb) {
			if( e!=null) {
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getPhonenumber()+"\t"+e.getSalary());
			}
			
		}
	}
	
	public Employee getEmployee(int id) {
		
		Employee emp=null;
		for(Employee e : empdb) {
			if(e !=null && e.getId()==id) {
				emp=e;
				System.out.println("employee found in database");
				break;
			}
		}
		return emp;
	}

}
