package admin;

public class Employee {
	
	private final int id;
	private String name;
	private long phonenumber;
	private double salary;
	
	public Employee(int id, String name, long phonenumber, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", salary=" + salary + "]";
	}
	
	

}
