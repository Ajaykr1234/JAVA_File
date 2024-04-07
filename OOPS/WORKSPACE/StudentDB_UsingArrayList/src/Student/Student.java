package Student;

public class Student {
	
	int erollno;
	String sName;
	String sFatherName;
	String sMotherName;
	int sage;
	long ephone;
	String sAddress;
	
	public Student(int erollno, String sName, String sFatherName, String sMotherName, int sage, long ephone,
			String sAddress) {
		this.erollno = erollno;
		this.sName = sName;
		this.sFatherName = sFatherName;
		this.sMotherName = sMotherName;
		this.sage = sage;
		this.ephone = ephone;
		this.sAddress = sAddress;
	}

	public int getErollno() {
		return erollno;
	}

	public void setErollno(int erollno) {
		this.erollno = erollno;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsFatherName() {
		return sFatherName;
	}

	public void setsFatherName(String sFatherName) {
		this.sFatherName = sFatherName;
	}

	public String getsMotherName() {
		return sMotherName;
	}

	public void setsMotherName(String sMotherName) {
		this.sMotherName = sMotherName;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public long getEphone() {
		return ephone;
	}

	public void setEphone(long ephone) {
		this.ephone = ephone;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "Student [erollno=" + erollno + ", sName=" + sName + ", sFatherName=" + sFatherName + ", sMotherName="
				+ sMotherName + ", sage=" + sage + ", ephone=" + ephone + ", sAddress=" + sAddress + "]";
	}
	
	

}
