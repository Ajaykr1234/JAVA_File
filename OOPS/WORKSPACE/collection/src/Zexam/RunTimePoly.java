package Zexam;

interface Bank{
	void accountDetails();
}

class SBI implements Bank{
	private String bName="Sbi";
	private String Ifsc = "Sbi1233";
	private String name ="shyam";
	@Override
	public void accountDetails() {
       System.out.println("Bank Acount Name"+bName);
       System.out.println("Ifsc code "+Ifsc);
       System.out.println("Account holder name"+name);
	}
	
}

class PNB implements Bank{
	private String bName="PNB";
	private String Ifsc = "PNB1233";
	private String name ="ram";
	@Override
	public void accountDetails() {
       System.out.println("Bank Acount Name"+bName);
       System.out.println("Ifsc code "+Ifsc);
       System.out.println("Account holder name"+name);
	}
	
}

class BankSimulator{
	public void getDetails(Bank b) {
		b.accountDetails();
	}
}


public class RunTimePoly {
	
	public static void main(String[] args) {
		BankSimulator bs = new BankSimulator();
		bs.getDetails(new SBI());
		bs.getDetails(new PNB());
	}

}
