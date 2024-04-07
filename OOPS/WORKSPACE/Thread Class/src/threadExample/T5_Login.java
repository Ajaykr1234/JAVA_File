package threadExample;

public class T5_Login {
	
	public static void main(String[] args) {
		
		
		String username = "manager";
		String pass = "admin";
		
		switch (args.length) {
		case 0:
			System.out.println("NO user and password Entered");
			System.out.println("Java login user and password");
			break;
		case 1:
			System.out.println("you have enter only user name");
			System.out.println("Java login user and password");
			break;
		case 3:
			if (args[0].equals(username) && args[1].equals(pass)) {
				System.out.println("Login sussccusfull");
			} else {
				System.out.println("Login faild");
			}
			break;

		default:
			System.out.println("Syntax Error");
			System.out.println("Java login user and password");
			break;
		}
	
	}

	
	
}


