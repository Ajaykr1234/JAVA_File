public class Program5 {
    public static void main(String[] args) {
        double Accbal = 100000;
        double deposite = 50000;
        double withdraw = 10000;

        System.out.println("your Account Balance is = "+Accbal);
        System.out.println(deposite + " Amount is deposite in your account ");

        // Accbal = Accbal+deposite;
        Accbal += deposite;

        System.out.println("your account balance is = "+Accbal);
        System.out.println(withdraw + " is withdrow from your account ");

        // Accbal = Accbal+withdraw;
        Accbal -= withdraw;

        System.out.println("your Account balance is = " +Accbal);
        

    }
    
}
