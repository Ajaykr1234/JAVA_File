package entity;

public class Customer {

	private String cname;
	private int cid;
	private long cphoneNo;
	private String cmail;
	private String pan;
	private double camt;

	public double getCamt() {
		return camt;
	}

	private Address caddress;

	public Customer(String cname, int cid, long cphoneNo, String cmail, String pan, Address caddress) {
		this.cname = cname;
		this.cid = cid;
		this.cphoneNo = cphoneNo;
		this.cmail = cmail;
		this.pan = pan;
		this.caddress = caddress;
	}

	public void setCamt(double camt) {
		this.camt = camt;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public long getCphoneNo() {
		return cphoneNo;
	}

	public void setCphoneNo(long cphoneNo) {
		this.cphoneNo = cphoneNo;
	}

	public String getCmail() {
		return cmail;
	}

	public void setCmail(String cmail) {
		this.cmail = cmail;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Address getCaddress() {
		return caddress;
	}

	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", cphoneNo=" + cphoneNo + ", cmail=" + cmail + ", pan="
				+ pan + ", caddress=" + caddress + "]";
	}

}
