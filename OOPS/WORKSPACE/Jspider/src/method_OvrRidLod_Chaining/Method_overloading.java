package method_OvrRidLod_Chaining;

import java.util.Scanner;

class stupus{
	void login(int id,int pass) {
		if(id==123 && pass == 321) {
			System.out.println(id+" login successfully");
		}else {
			System.out.println("invaid id and password");
		}
	}
	
	void login(String email,int pass) {
		if(email=="aj@gmail.com" && pass == 321) {
			System.out.println(email+" login successfully");
		}else {
			System.out.println("invaid email and password");
		}
	}
	
	void login(long phone,int pass) {
		if(phone ==919977L && pass == 321) {
			System.out.println(phone+" login successfully");
		}else {
			System.out.println("invaid phone and password");
		}
	}
}



public class Method_overloading {
	public static void main(String[] args) {
		stupus s= new stupus();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your options\n1.with id and pass\n2.with email and pass\n3.with phone and pass ");
		
		int opt = sc.nextInt();
		
	  switch (opt) {
	  case 1:
		 System.out.println("Enter your id");
		 int id = sc.nextInt();
		 System.out.println("enter your password");
		 int pass = sc.nextInt();
		 s.login(id, pass);
		 
		
		break;
	  case 2:
			 System.out.println("Enter your amail");
			 String email = sc.next();
			 System.out.println("enter your password");
			 int pass1 = sc.nextInt();
			 s.login(email, pass1);
			 
			
			break;
	  case 3:
			 System.out.println("Enter your phone");
			 long phone = sc.nextLong();
			 System.out.println("enter your password");
			 int pass3 = sc.nextInt();
			 s.login(phone, pass3);
			 
			
			break;



	default:System.out.println("invaild option try again");
		break;
	}
	}
	
	

}
