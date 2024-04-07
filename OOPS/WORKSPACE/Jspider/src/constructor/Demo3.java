package constructor;

class Employee{
	String name;
	int id;
	double salary ;
	
	Employee(String arg,int arg2 , double arg3){
		name = arg;
		id = arg2;
		salary = arg3;
	}
}


public class Demo3 {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Ram",123,125.36);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
	}

}
