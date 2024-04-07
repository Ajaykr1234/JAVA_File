package StudentApp;

import java.util.Scanner;

import StudentService.Student_service;
import StudentServiceImp.StudentServiceImp;
import app.Mainclass;

public class Student_App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Mainclass m1= new Mainclass();
		System.out.println(m1);
		
		
		Student_service ss = new StudentServiceImp();
		
		System.out.println("Welcome to student database");
		while(true) {
			System.out.println("01.Add student\n02.Remove Student \n03.View all detals \n04 exit");
			System.out.println("Enter yr Option : ");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				ss.addStud();
				break;
			case 2:
				ss.remStud();
				break;
			case 3:
				ss.getAllStud();
				break;
			case 4:
				System.exit(0);
				break;	

			default:
				System.out.println("Invaild options");
				break;
			}
		}
	}

}
