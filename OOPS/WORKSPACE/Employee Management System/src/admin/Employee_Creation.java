package admin;


public class Employee_Creation {
	
	private static int initId=1001;
	
	public static Employee create(String name,long phonenumber,double salary) {
		
		return new Employee(initId++,name,phonenumber,salary);
	}
}


//single task /responsibility