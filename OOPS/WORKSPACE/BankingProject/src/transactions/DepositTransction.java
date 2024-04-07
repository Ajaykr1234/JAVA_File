package transactions;

import accounts.Account;

public class DepositTransction {
	public void  deposite(Account a1,double deposite) {
		a1.setAcc_bal(a1.getAcc_bal()+deposite);
		
	}

}
