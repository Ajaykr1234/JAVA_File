class Account {
    String AccoundHolderName;
    long accnum;
    static final String IFSC = "PNUB00454";
    double ammount;

}

public class Mainclass13 {
    public static void main(String[] args) {
        Account A1 = new Account();
        A1.AccoundHolderName = "ram";
        A1.accnum = 5478546;
        A1.ammount = 100000;
        System.out.println(A1.AccoundHolderName);
        System.out.println(A1.accnum);

        System.out.println(Account.IFSC);
        System.out.println(A1.ammount);
    }

}
