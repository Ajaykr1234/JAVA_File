package controller_App;

import java.util.Scanner;
import sevice.HotelService;
import seviceImp.HotelServiceImp;

public class HotelApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HotelService h1 = new HotelServiceImp();
		
		System.out.println("");
		while(true) {
			System.out.println("=========Menu============");
			System.out.println("1.Room Details\n2.Available Room\n3.Allocate Room\n4.CheakOut\n5.Find All Customer\n6.Get Customer By Id\n7.Exit");
			System.out.println("Enter your options");
			int op = sc.nextInt();
			
			switch (op) {
			case 1:
				h1.roomInfo();
				break;
			case 2:
				h1.availableRoom();
				break;
			case 3:
				h1.allocateRoom();
				break;
			case 4:
				h1.cheakout();
				break;
			case 5:
				h1.findAllCustomer();
				break;
			case 6:
				h1.getCustomerById();
				break;
			case 7:
				System.exit(0);
				break;	
			default:System.out.println("Thank You Visite Again");
				break;
			}
		}
	}

}
