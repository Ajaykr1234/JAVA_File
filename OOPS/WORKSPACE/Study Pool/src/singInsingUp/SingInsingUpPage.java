package singInsingUp;

import java.util.Scanner;

import service.UserService;
import serviceImp.UserServiceImp;
import service.AdminService;
import serviceImp.AdminServiceImp;

public class SingInsingUpPage extends UserServiceImp {
	Scanner sc = new Scanner(System.in);
	UserService user = new UserServiceImp();
	AdminService admin = new AdminServiceImp();

	public void createProfile() {
		System.out.println("if u r new user please reg frist");
		System.out.println("1.Login\n2.Registration\n3.Forgot Pin");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			user.loginUser();

			break;
		case 2:
			user.addUser();
			break;
		case 3:
			user.resetpin();
			;
			break;

		default:
			System.out.println("Invaild choice ");
			break;
		}
	}

	public void createProfile1() {
		System.out.println("if u r new Admin please reg frist ");
		System.out.println("1.Login\n2.Registration\n3.Forgot Pin");
		int n = sc.nextInt();
		switch (n) {
		case 1:

			admin.loginAdmin();

			break;
		case 2:

			admin.addAdmin();
			break;
		case 3:

			admin.resetpin();
			break;

		default:
			System.out.println("Invaild choice ");
			break;
		}
	}

}
