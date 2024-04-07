package arrayList;

import java.util.ArrayList;

class Enployee{
	private int id;
    private String name;
    private double sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Enployee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
  
}

public class Dtest {
	
	public static void main(String[] args) {
		
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"Ram", 1.255);
		Employee e2 = new Employee(2,"Ra", 1.2455);
		Employee e3 = new Employee(3,"am", 1.2555);
		Employee e4 = new Employee(4,"Rm", 1.25455);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		for(Employee e : emp) {
			System.out.println(e);
		}
	}

}
