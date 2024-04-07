package transactions;

import accounts.Account;

public class FundTransfer {
	public boolean transfer(Account fromaccount,Account toaccount,double fundAmt) {
		if(fromaccount.getAcc_bal()>fundAmt) {
			fromaccount.setAcc_bal(fromaccount.getAcc_bal()-fundAmt);
			toaccount.setAcc_bal(toaccount.getAcc_bal()+fundAmt);
			return true;
		}else {
			return false;
		}
		
		
	}

}
