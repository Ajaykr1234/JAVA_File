package employee;

public class Employee {
	
	private int eid;
	private String ename;
	private double esal;
	private long phonenum;
	private String edig;
	
	public Employee(int eid, String ename, double esal, long phonenum, String edig) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.phonenum = phonenum;
		this.edig = edig;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}

	public String getEdig() {
		return edig;
	}

	public void setEdig(String edig) {
		this.edig = edig;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", phonenum=" + phonenum + ", edig="
				+ edig + "]";
	}
	
	
	

}
