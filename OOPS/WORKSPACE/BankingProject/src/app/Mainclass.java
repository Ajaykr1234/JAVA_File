package app;

import java.util.Scanner;

import accounts.Account;
import accounts.AccountCreation;
import transactions.*;


public class Mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter yr name : ");
		String name = sc.next();
		System.out.print("Enter yr Depoit amt : ");
		double deposit = sc.nextDouble();
		System.out.print("Enter yr Withdraw amt : ");
		double withDraw = sc.nextDouble();
		System.out.print("Enter yr Fund tansfer amt : ");
		double fundAmt = sc.nextDouble();
		
		AccountCreation ac = new AccountCreation();
		Account a1 = ac.createAccount(name, "PUNB001", 123456, 5000);
		Account a2 = ac.createAccount(name, "PUNB001", 123456, 12000);
		
		ViewAccountBalance v1 = new ViewAccountBalance();
		DepositTransction d1 = new DepositTransction();
		WithdrawTranaction w1 =new WithdrawTranaction();
		FundTransfer f1 = new FundTransfer();
		
		v1.viewBalance(a1);
		d1. deposite(a1, deposit);
		w1.withdraw(a1,withDraw);
		f1.transfer(a1,a2,fundAmt);
		
	}

}
