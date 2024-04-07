package constructor;
import java.util.Scanner;
class registation{
	String name;
	char gender;
	int age;
	long mobileno;
	String email;
	
	public registation(String name, char gender, int age, long mobileno) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mobileno = mobileno;
	}
	
	public registation(String name, char gender, int age, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
	}
	public void details(){
	        System.out.println("Registration successful.....");
		System.out.println("user name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Mobile number : "+mobileno);
		System.out.println("Email "+email);
		
	}
	
}















public class Demo7_Overloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter yr option ");
		char ans = sc.next().charAt(0);
		switch (ans) {
		case 'm':
		case 'M':
			System.out.print("Enter yr name : ");
			String name = sc.next();
			System.out.print("Enter yr gender : ");
			char gender = sc.next().charAt(0);
			System.out.print("Enter yr age :  ");
			int age = sc.nextInt();
			System.out.print("Enter yr mobile number : ");
			long mobileno = sc.nextLong();
			registation r = new registation(name,gender,age,mobileno);
			r.details();
			break;
			
		case 'e':
		case 'E':
			System.out.print("Enter yr name : ");
			String name1 = sc.next();
			System.out.print("Enter yr gender : ");
			char gender1 = sc.next().charAt(0);
			System.out.print("Enter yr age :  ");
			int age1 = sc.nextInt();
			System.out.print("Enter yr email : ");
			String email = sc.next();
			registation r1 = new registation(name1,gender1,age1,email);
			r1.details();
			break;	

		default:
			System.out.println("Invaild choise! try again");
			break;
		}
	}
}
