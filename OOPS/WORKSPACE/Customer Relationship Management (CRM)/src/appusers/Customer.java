package appusers;

public class Customer {
	private String  customer_name;
	private char gender;
     private int  age ;
	private long mobile_no;
	private Address addr;  // creating a reference variable  of Address class
	
	public Customer(String customer_name, char gender, int age, long mobile_no, int houseno, String streetname, String areaname, String city, String state, int pincode) {
		
		this.customer_name = customer_name;
		this.gender = gender;
		this.age = age;
		this.mobile_no = mobile_no;
		this.addr = new Address(houseno,streetname, areaname, city,state, pincode);
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	
	
	
	
	
	
}
