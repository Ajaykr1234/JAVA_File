import java.util.Scanner;

class Bank_account {
    
    String account_holdername;
    long account_no;
    String  ifsc_code;
    double balance;
    int Actualpin = 123;
   Scanner sc = new Scanner(System.in);
    public Bank_account(String account_holdername, long account_no, String ifsc_code, double balance) {
        this.account_holdername = account_holdername;
        this.account_no = account_no;
        this.ifsc_code = ifsc_code;
        this.balance = balance;
    }
    void account_holderDetails(){
        System.out.println("Account Holder name = "+account_holdername);
        System.out.println("Account number = "+account_no);
        System.out.println("IFSC Code = "+ifsc_code);
    }
    void available_balance(){
        System.out.println("Available Balance is "+balance);

    }
    void deposite_balance(){
        System.out.print("enter your amount to deposite = ");
      double amount =sc.nextDouble();
        balance+=amount;
        System.out.println(+amount+" deposited succesfully..........");
         System.out.println("Available Balance is "+balance);

    }
     void withdraw_balance(){
         System.out.print("enter your amount to withdraw = ");
        double amount =sc.nextDouble();
        System.out.print("Enter your pin = ");
        int pin= sc.nextInt();
       
        if(pin==Actualpin){
                
            if(balance>=amount){
            balance-=amount;
            System.out.println(+amount+" withdraw succesfully............");
            System.out.println("Available Balance is "+balance);
            }else{
                System.out.println("Insufficient Amount!!!......");
                System.out.println("Available Balance is "+balance);
            }
       
      }else{
        System.out.println("Wrong Pin!!!......");
      }
         
      }
        
        
    
        

    
    
}
