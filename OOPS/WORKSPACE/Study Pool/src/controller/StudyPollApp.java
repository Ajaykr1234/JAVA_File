package controller;

import java.util.Scanner;
import service.AdminService;
import service.UserService;
import serviceImp.AdminServiceImp;
import serviceImp.UserServiceImp;
import singInsingUp.SingInsingUpPage;

public class StudyPollApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==============Welcome to StudyPool=====================");
		System.out.println("Studypool is an online platform that provides a marketplace for students to receive academic help and tutoring.\n1.Academic Assistance Marketplace:\n\t Studypool operates as a marketplace where students can seek help with their academic assignments, questions, and homework. They can connect with expert tutors, educators, and subject matter experts.");
		

		SingInsingUpPage log = new SingInsingUpPage();
		

		while (true) {
			System.err.println("1.Login as User\n2.Login as Admin\n3.EXit ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				log.createProfile();
				break;
			case 2:
				log.createProfile1();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invaild choice ");
				break;
			}
		}
	}

}
