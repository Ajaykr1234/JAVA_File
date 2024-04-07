package accounts;

public class Account {
	
	private String name;
	private long account_num;
	private String ifsc_code;
	private double acc_bal;
	public char[] account;
	
	//constructor
	public Account(String name,String ifsc_code, long account_num,  double acc_bal) {

		this.name = name;
		this.account_num = account_num;
		this.ifsc_code = ifsc_code;
		this.acc_bal = acc_bal;
	}

	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccount_num() {
		return account_num;
	}

	public void setAccount_num(long account_num) {
		this.account_num = account_num;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public double getAcc_bal() {
		return acc_bal;
	}

	public void setAcc_bal(double acc_bal) {
		this.acc_bal = acc_bal;
	}
	
	
	

}
