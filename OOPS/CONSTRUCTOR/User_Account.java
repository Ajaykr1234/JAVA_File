public class User_Account {
    String name;
    String email;
    String password;
    long mobile_number;
    char gender;
    int age;

    User_Account(String name,long mobile_number,String password,char gender,int age){
        this.name=name;
        this.mobile_number = mobile_number;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }

     User_Account(String name,String email,String password,char gender,int age){
        this.name=name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }

    void Details(){
        System.out.println("Registration Succesfully Done..!!!");
        System.out.println("user name : "+name +"\nUser Mobile Number : "+mobile_number+"\nUser email : "+email +"\nUser Password : "+password+"\nGender : "+gender+"\nUser age : "+age);
    }
    
}
