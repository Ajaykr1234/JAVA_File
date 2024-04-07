import java.util.Scanner;

public class Main_UserAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P to reg with phone \nEnter e to reg with email : ");
        char ans = sc.next().charAt(0);
        switch (ans) {
            case 'p':
            case 'P':
            System.out.print("Enter yr name : ");
            String name = sc.next();
            System.out.print("Enter yr Phone no : ");
            long mobile_number = sc.nextLong();
            System.out.print("Enter yr password : ");
            String password = sc.next();
            System.out.print("Enter yr Gender : ");
            char Gender = sc.next().charAt(0);
            // if((Gender=='m'||Gender=='M')||(Gender=='f'||Gender=='F')){
            //     Gender = Gender;

            // }else{
            //     System.out.println("Invaild gender plsease enter m and f");
            // }
            System.out.print("Enter yr age : ");
            int age = sc.nextInt();
            User_Account U1 = new User_Account(name,mobile_number,password, Gender, age);
             U1.Details();
                
                break;
            case 'e':
            case 'E':
            System.out.print("Enter yr name : ");
            String name1 = sc.next();
            System.out.print("Enter yr Phone no : ");
            String email = sc.next();
            System.out.print("Enter yr password : ");
            String password1 = sc.next();
            System.out.print("Enter yr Gender : ");
            char Gender1 = sc.next().charAt(0);
            System.out.print("Enter yr age : ");
            int age1 = sc.nextInt();
            User_Account U2 = new User_Account(name1,email,password1, Gender1, age1);
             U2.Details();
                
                break;
        
            default:
            System.out.println("Wrong Input..!!! Please give valid input.....");
                break;
        }
    }
    
}
