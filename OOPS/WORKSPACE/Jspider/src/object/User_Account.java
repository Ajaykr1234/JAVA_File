package object;

class user{
	String name;
	long mobile;
	String password;
	
	void updatename(String newname) {
		System.out.println("updating name");
		name = newname;
		System.out.println(name);
	}
	void updatemobile(long newmob) {
		System.out.println("updating mobile");
		mobile= newmob;
		System.out.println(mobile);
	}
	void updatepass(String newpass) {
		System.out.println("updating pass");
		password= newpass;
		System.out.println(password);
	}
}
public class User_Account {
	public static void main(String[] args) {
		user u1 = new user();
		u1.updatename("Ram");
		u1.updatemobile(123654);
		u1.updatepass("1235l");
		
	}
	
	
	
	

}
