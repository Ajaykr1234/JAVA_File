import java.util.Scanner;

public class Main_ticket {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter no of ticket available = ");
        // int no_of_ticket = sc.nextInt();
        TicketCounter T1 = new TicketCounter(500,125);
        System.out.println("counter no is = " +T1.counter_number);
    
        T1.ticketavailable();
        T1.buyticket();
        T1.ticketavailable();
        T1.cancelticket();
        T1.ticketavailable();
    }
    
}
