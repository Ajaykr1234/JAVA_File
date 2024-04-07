import java.util.Scanner;

public class TicketCounter {
    int no_of_ticket;
    int counter_number;
    int total_ticket;
   
    Scanner sc = new Scanner(System.in);

    TicketCounter(int  no_of_ticket,int counter_number){
        this.no_of_ticket=no_of_ticket;
        this.counter_number = counter_number;

    }
    void ticketavailable(){
     
        System.out.println("Available ticket = "+no_of_ticket);
    }
    void buyticket(){
        System.out.print("enter how many member you are = ");
        int n = sc.nextInt();
        System.out.println("buying "+n+" tickets succesfully");
        if(no_of_ticket>=n){
            no_of_ticket-=n;
        }else{
            System.out.println("buy ticket faild due insuficient ticket");
        }
    }
    void cancelticket(){
        System.out.print("how many ticket u want to cancled = ");
        int n = sc.nextInt();
        System.out.println("canceling "+n+" ticket succesfully");
        //    no_of_ticket +=n;
        if(n==this.total_ticket){
           no_of_ticket +=n;
        }else{
            System.out.println("cancle ticket failed due unsufficient ticket");
        }
      

    }

    
}
