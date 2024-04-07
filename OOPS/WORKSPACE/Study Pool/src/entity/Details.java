package entity;

public class Details {

	private String Name;
	private int Age;
	private String Edu;
	private String EmailId;
	private long PhoneNo;
	private String Pass;
	public Details(String name, int age, String edu, String emailId, long phoneNo, String pass) {
		super();
		Name = name;
		Age = age;
		Edu = edu;
		EmailId = emailId;
		PhoneNo = phoneNo;
		Pass = pass;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEdu() {
		return Edu;
	}
	public void setEdu(String edu) {
		Edu = edu;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	@Override
	public String toString() {
		return "Details [Name=" + Name + ", Age=" + Age + ", Edu=" + Edu + ", EmailId=" + EmailId + "]";
	}

	

}
