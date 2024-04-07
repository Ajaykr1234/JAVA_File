
import java.util.Scanner;
public class MobileDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter yr Brand name = ");
        String brname= sc.next();
       System.out.print("enter yr color name = ");
       String col=sc.next();
          System.out.print("enter yr price = ");
          double pri = sc.nextDouble();
          Mobile M1 = new Mobile(brname,col,pri);
          M1.Details();
    }
    
}
