package constructor;
class Bank_Account{
	String holder_name;
	long accountNumber;
	String ifsecode;
	double account_balance;
	public Bank_Account(String holder_name, long accountNumber, String ifsecode, double account_balance) {
		
		this.holder_name = holder_name;
		this.accountNumber = accountNumber;
		this.ifsecode = ifsecode;
		this.account_balance = account_balance;
	}
	
	void availablebalance() {
		System.out.println("avilable balance "+account_balance);
		
	}
	void depositebalance(double deposit) {
		System.out.println("Deposit "+deposit+" successful...");
		account_balance += deposit;
		System.out.println("avilable balance "+account_balance);
		
	}
	
	void withdrawbalance(double withderaw) {
		if(withderaw<=account_balance) {
			account_balance -= withderaw; 
			System.out.println("withdraw "+withderaw+" succesful.........");
			System.out.println("avilable balance "+account_balance);
		}
		
	}
	
}
public class Demo6 {
	
	public static void main(String[] args) {
		Bank_Account ac = new Bank_Account("ram",1234,"pnb12",10000);
		ac.availablebalance();
		ac.depositebalance(500);
		ac.withdrawbalance(2534);
		
	}

}