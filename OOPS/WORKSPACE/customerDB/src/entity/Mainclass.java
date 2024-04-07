package entity;

public class Mainclass {
	public static void main(String[] args) {
		
		Address a1  = new Address("#90", "2nd stage","karnataka", "india",560076);
		Customer c1 = new Customer("Ram", 01, 12345, "ram@gmail.com","jax4536f", a1);
		String n=c1.getCaddress().getDoorno();
		System.out.println(n);
		System.out.println(c1);
	}

}
