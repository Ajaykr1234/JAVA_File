package transactions;

import accounts.Account;

public class WithdrawTranaction {
	
	public boolean withdraw(Account a1,double withDraw) {
		if(a1.getAcc_bal()>=withDraw) {
			a1.setAcc_bal(a1.getAcc_bal()-withDraw);
			return true;
		}
			else {
				return false;
			}
	}
}

