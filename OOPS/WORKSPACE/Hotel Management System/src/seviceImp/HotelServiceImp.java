package seviceImp;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

import dao.HotelRepo;
import entity.Address;
import entity.Customer;
import sevice.HotelService;

public class HotelServiceImp implements HotelService, HotelRepo {

	/*
	 * block for when we start the application our room in initil and show how many
	 * room are available
	 */
	{
		for (int i = 1; i <= 10; i++) {
			cm.put(i, null);

		}

		for (int i = 1; i <= 8; i++) {
			sm.put(i, null);

		}

		for (int i = 1; i <= 5; i++) {
			dm.put(i, null);

		}

	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void roomInfo() {
		System.out.println("=============Classic Rooms==================");
		System.out.println("Hot Water : Yes");
		System.out.println("Ac : No");
		System.out.println("Tv : No");
		System.out.println("WiFi : No");
		System.out.println("Price : 2000 Rs");
		System.out.println("=============Standard Rooms==================");
		System.out.println("Hot Water : Yes");
		System.out.println("Ac : No");
		System.out.println("Tv : Yes");
		System.out.println("WiFi : No");
		System.out.println("Price : 2500 Rs");
		System.out.println("=============Deluxe Rooms==================");
		System.out.println("Hot Water : Yes");
		System.out.println("Ac : Yes");
		System.out.println("Tv : Yes");
		System.out.println("WiFi : Yes");
		System.out.println("Price : 35000 Rs");

	}

	public void checkRoom(LinkedHashMap<Integer, Customer> l1) {
		boolean flage = false;
		for (Integer ele : l1.keySet()) {
			if (l1.get(ele) == null) {
				System.out.print(ele + " ");
				flage = true;
			}

		}
		System.out.println();
		if (flage == false) {
			System.out.println("Room not Available");

		}
	}

	@Override
	public void availableRoom() {
		System.out.println("========Available Rooms===========");

		System.out.println("=============Classic Rooms==================");
		checkRoom(cm);
		System.out.println("=============Standard Rooms==================");
		checkRoom(sm);
		System.out.println("=============Deluxe Rooms==================");
		checkRoom(dm);
	}

	Customer createCustomer() {
		System.out.println("==============Enter your Detalis============ ");
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your Id ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Phone Number ");
		long number = sc.nextLong();
		System.out.println("Enter your Email Id");
		String email = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your Pan Card");
		String pan = sc.nextLine();
	
//		System.out.println("Enter your Ammount");
//		Double amt = sc.nextDouble();

		System.out.println("Enter your Door no :");
		String doorno = sc.nextLine();
		System.out.println("Enter your street : ");
		String street = sc.nextLine();
		System.out.println("Enter your State : ");
		String state = sc.nextLine();
		System.out.println("Enter your Pincode : ");
		int pinCode = sc.nextInt();

		Address ads = new Address(doorno, street, state, state, pinCode);
		Customer cus = new Customer(name, id, pinCode, email, pan, ads);
		return cus;
	}

	public void mapRoom(LinkedHashMap<Integer, Customer> l1, int roomNo, double amt) {
		if (l1.get(roomNo) == null) {
			Customer c = createCustomer();
			al.add(c);
			l1.put(roomNo, c);
			c.setCamt(amt);
			System.out.println("Room No " + roomNo + " has been allocated for " + c.getCname());

		} else {
			System.out.println("Room not Available.....!!!");
		}

	}

	@Override
	public void allocateRoom() {
		System.out.println("==========Menu============");
		System.out.println("1.Classic Rooms\n2.Standard Rooms\n3.Deluxe Rooms");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("Enter the Room number ");
			int roomNo1 = sc.nextInt();
			if (roomNo1 >= 1 && roomNo1 <= 10) {
				mapRoom(cm, roomNo1, 2000);
			} else {
				System.out.println("Enter correct room number ");
			}

			break;
		case 2:
			System.out.println("Enter the Room number ");
			int roomNo2 = sc.nextInt();
			if (roomNo2 >= 1 && roomNo2 <= 8) {
				mapRoom(sm, roomNo2, 2500);
			} else {
				System.out.println("Enter correct room number ");
			}

			break;
		case 3:
			System.out.println("Enter the Room number ");
			int roomNo3 = sc.nextInt();
			if (roomNo3 >= 1 && roomNo3 <= 5) {
				mapRoom(dm, roomNo3, 3500);
			} else {
				System.out.println("Enter correct room number ");
			}
			break;

		default:
			break;
		}
	}

	public void unMapRoom(LinkedHashMap<Integer, Customer> l1, int roomNo) {
		if (l1.get(roomNo) != null) {
			Customer c1 = l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname()+" need to pay "+c1.getCamt()+" Rs.");
			l1.put(roomNo, null);
			//l1.remove(c1)

		} else {
			System.out.println("Room Number Invaild .....!!!");
		}

	}

	@Override
	public void cheakout() {
		System.out.println("==========Menu============");
		System.out.println("1.Classic Rooms\n2.Standard Rooms\n3.Deluxe Rooms");
		int option = sc.nextInt();
		System.out.println("Enter the room Number ");
		int roomno = sc.nextInt();

		switch (option) {
		case 1:
			if (roomno >= 1 && roomno <= 10) {
				unMapRoom(cm,roomno);

			} else {
				System.out.println("Invalid room Number");
			}

			break;
		case 2:
			if (roomno >= 1 && roomno <= 8) {
				unMapRoom(sm,roomno);

			} else {
				System.out.println("Invalid room Number");
			}

			break;
		case 3:
			if (roomno >= 1 && roomno <= 5) {
				unMapRoom(dm,roomno);

			} else {
				System.out.println("Invalid room Number");
			}

			break;

		default:System.out.println("Invaild Options ");
			break;
		}

	}

	@Override
	public void findAllCustomer() {
		if(al.size()==0) {
			System.out.println("DataBase Empty ");
		}else {
			for (Customer cus : al) {
				System.out.println(cus);
			}
		}
		
	}

	@Override
	public void getCustomerById() {
		boolean flage = false;
		System.out.println("Enter the Customer Id ");
		int cid = sc.nextInt();
		for (Customer cus : al) {
			if(cus.getCid()==cid) {
				System.out.println(cus);
				flage = true;
				break;
			}
		}
		if(flage==false) {
			System.out.println("Invaild Customer Id..!!");
		}
		
	}



	
}
