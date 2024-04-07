import java.util.Scanner;

public class main_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Account holder name = ");
        String account_holdername = sc.nextLine();
        Bank_account B1 = new Bank_account(account_holdername, 1524578554,"PUNB10156685",1000);
      
        B1.account_holderDetails();
        B1.available_balance();
        B1.deposite_balance();
        B1.withdraw_balance();

    }
    
}
