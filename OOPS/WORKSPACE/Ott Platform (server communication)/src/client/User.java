package client;

public class User {

	 private String name;
	 private long phonenum;
	 private String email;
	 private int age;
	 private String password;
	 
	public User(String name, long phonenum, String email, int age, String password) {
		super();
		this.name = name;
		this.phonenum = phonenum;
		this.email = email;
		this.age = age;
		this.password = password;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	 
	 
}
