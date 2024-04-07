package serviceImp;

import service.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import doc.DocMain;
import entity.Details;
import entity.User;

public class UserServiceImp implements UserService {

	Scanner sc = new Scanner(System.in);
	DocMain d = new DocMain();
	// creating dumy memory
	ArrayList<User> ul = new ArrayList<User>();

	@Override
	public void addUser() {

		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Education :");
		String edu = sc.nextLine();
		System.out.println("Enter your Stream :");
		String str = sc.nextLine();
	
		System.out.println("Enter your Email ID : ");
		String email = sc.nextLine();
		System.out.println("Enter your Phone Number : ");
		long phno = sc.nextLong();
		System.out.println("Enter your Password : ");
		String pass = sc.next();

		Details d1 = new Details(name, age, edu, email, phno, pass);
		ul.add(new User(str, d1));
		System.out.println("Registration Done......");
	}

	@Override
	public void loginUser() {
		System.out.println("Enter your mobile Number : ");
		int no = sc.nextInt();
		System.out.println("Enter your Password :");
		String pass = sc.next();
		User usr1 = null;
		for (User usr : ul) {
//			System.out.println(usr);
			if (usr.getDel().getPhoneNo()== no && usr.getDel().getPass().equals(pass)) {
				usr1 = usr;
				break;
			}
			if (usr.getDel().getPhoneNo() != no && !usr.getDel().getPass().equals(pass)) {
				System.out.println("Invalid Phone Number and Password ");
			} else if (usr.getDel().getPhoneNo() != no) {
				System.out.println("Invaild Number");

			} else /* if (!usr.getuPass().equals(pass)) */ {
				System.out.println("Invaild Password ");

			}
		}

		if (usr1 != null) {

			System.out.println("Login Successfull ");
			try {
				d.studypoolMain();
			} catch (IOException e) {

				e.printStackTrace();
			}

		} else {
			System.out.println("Login Faild Please check your mobile number  and password ");
		}

	}

	@Override
	public void resetpin() {
		System.out.println("Enter your Mobile Number ");
		long mobno = sc.nextLong();
		User us1 = null;
		for (User usr : ul) {
			if (usr.getDel().getPhoneNo()== mobno) {
				us1 = usr;
				break;
			}
		}

		if (us1 != null) {
			System.out.println("Enter your new password ");
			String pass = sc.next();
			us1.getDel().setPass(pass);
			System.out.println("Password updateted successfull........");
		} else {
			System.out.println("Wrong Phone Number Try Again");
		}

	}
}
