package classtype;
 
class Demo88{
		int x = 100;
		double y = 125;
		
}

public class Demo8 {
	
public static void main(String[] args) {
	
	Demo88 d1 = new Demo88();
	System.out.println(d1);
	System.out.println("1st object x value is "+d1.x);
	System.out.println("1st object y value is "+d1.y);
	
	Demo88 d2 = new Demo88();
	System.out.println("2st object x value is "+d2.x);
	System.out.println("2st object y value is "+d2.y);
	
	System.out.println("========== modify only 1st object value======== ");
	d1.x=4586547;
	d1.y=4568753.23;
	System.out.println("1st object x value is "+d1.x);
	System.out.println("1st object y value is "+d1.y);
	System.out.println("2st object x value is "+d2.x);
	System.out.println("2st object y value is "+d2.y);
}
	

}
