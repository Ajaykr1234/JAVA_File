package constructor;

class Ticket_counter{
	int noofticket;
	int ticketcounter;
	
	Ticket_counter(int noofticket,int ticketcounter){
		this.noofticket=noofticket;
		this.ticketcounter=ticketcounter;
	}
	void viewAvailable() {
		System.out.println("no of ticket Available"+noofticket);
		
	}
	void buyingticket(int buyticket) {
		
		System.out.println("bying "+buyticket+" ticket");
		if(buyticket<=noofticket) {
			noofticket = noofticket-buyticket;
			System.out.println("congrate buying "+buyticket+" ticket successful....");
			System.out.println("now available ticket "+noofticket);
		}else {
			System.out.println("ticket buying faild due to inssuficent ticket ");
		}
	}
	void cancelticket(int cancel) {
		System.out.println("cancle "+cancel+" ticket ");
		noofticket = noofticket+cancel;
		System.out.println("now available ticket "+noofticket);
	}
}


public class Demo5 {
	
	public static void main(String[] args) {
		Ticket_counter tc = new Ticket_counter(100,123);
		tc.viewAvailable();
		tc.buyingticket(14);
		tc.cancelticket(2);	}

}
