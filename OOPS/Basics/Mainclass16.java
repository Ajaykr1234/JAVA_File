class UserAccount {
    String Name;
    String username;
    String email;
    long mobileNo;
    String Password;

    void updateName(String N) {
        System.out.println("updating name ...........");
        Name = N;
    }

    void updateusernmae(String U) {
        System.out.println("update user name ..............");
        username = U;

    }

    void updateemail(String E) {
        System.out.println("update email id ...............");
        email = E;
    }

    void updatemobileno(long M) {
        mobileNo = M;

    }

    void updatepassword(String P) {
        System.out.println("updateing password.............");
        Password = P;
    }
}

public class Mainclass16 {
    public static void main(String[] args) {
        UserAccount U1 = new UserAccount();
        U1.updateName(" ajay");
        U1.updateusernmae("ajay123");
        U1.updateemail("ajaykr1234@gmail.com");
        U1.updatemobileno(45862547);
        U1.updatepassword("ajay@123");
        System.out.println("user name" + U1.Name);
        System.out.println("user id is " + U1.username);
        System.out.println("user email id " + U1.email);
        System.out.println("usr mobile no is " + U1.mobileNo);
        System.out.println("user password is " + U1.Password);

    }

}
