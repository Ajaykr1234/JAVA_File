package appusers;

public class MainClass1 {
	public static void main(String[] args) {
  System.out.println("Creating Customer..");
  Customer c1 = new Customer("ajay", 'm', 24, 9199, 123, "morabazar","MAIRY","SIWAN", "BIHAR ", 841507);
  
  System.out.println("Customer name "+c1.getCustomer_name());
  System.out.println("poincode "+c1.getAddr().getPincode());
  System.out.println("current house number "+c1.getAddr().getHouseno());
  
  //changing house number 

  System.out.println("changing house number");
  c1.getAddr().setHouseno(561);
  System.out.println("Updated house number : "+c1.getAddr().getHouseno());
  
  
  //completed change the customer add
  Address newaddr = new Address(321,"2nd cross","jayanager ","bangluru", null, 0);
  c1.setAddr(newaddr);
  System.out.println("new house number "+c1.getAddr().getHouseno());
	}

}
