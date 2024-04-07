package server;

import client.User;

public class ServerSide {
	
	private static final VerifyUserAge vua = new VerifyUserAge();
	
		public void receiveData(User usr) throws InvalidAgeException {
			System.out.println("Receving data from client ");
		
		if (vua.validateAge(usr)!= true) {
			
			System.out.println("registration faild");
			throw new InvalidAgeException("age  should be greater than 18");
		} else {
			System.out.println("Registration successful");
		}
		
	}
	

}
