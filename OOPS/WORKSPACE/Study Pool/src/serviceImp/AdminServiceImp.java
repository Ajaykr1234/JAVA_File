package serviceImp;

import service.AdminService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Admin;
import entity.Details;
import entity.User;

public class AdminServiceImp implements AdminService {

	Scanner sc = new Scanner(System.in);

	ArrayList<Admin> al = new ArrayList<Admin>();

	@Override
	public void addAdmin() {

		System.out.println("Enter your Unique Id : ");
		String uniId = sc.nextLine();
		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your Education :");
		String edu = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your Exprencess : ");
		int exp = sc.nextInt();
		System.out.println("Enter your Email ID : ");
		String email = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your Phone Number : ");
		long phno = sc.nextLong();
		System.out.println("Enter your Password : ");
		String pass = sc.next();
		
		Details d1 = new Details(name, age, edu, email, phno, pass);

		al.add(new Admin(uniId, exp, d1));
		System.out.println("Registration Done......");

	}

	@Override
	public void loginAdmin() {
		System.out.println("Enter your mobile Number : ");
		int no = sc.nextInt();
		System.out.println("Enter your Password :");
		String pass = sc.next();
		Admin adm1 = null;

	}

	@Override
	public void resetpin() {
		// TODO Auto-generated method stub

	}

}
