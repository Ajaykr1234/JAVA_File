package accounts;

public class AccountCreation {
	
	public Account createAccount(String name,String ifsc_code, long account_num,  double acc_bal) {
		Account a1 = new Account(  name, ifsc_code,account_num,   acc_bal);
		return a1;
		
	}

}
