package classtype;

class testnon{
	int  x = 100;
	double y = 200;
	
	void disp() {
		System.out.println("i am testnon class disp method....");
	}
}


public class Demo5_NonStaticMember {
	int  x = 258;
	double y = 654;
	
	void disp() {
		System.out.println("i am demo5 class disp method....");
	}
	
      public static void main(String[] args) {
	   System.out.println("main method started ....");
	   
	   Demo5_NonStaticMember d5 = new Demo5_NonStaticMember();
	    System.out.println(d5); //printing address of demo5 obj
	   System.out.println("x value of demo5 class "+d5.x);
	   System.out.println("y value of demo5 class "+d5.y);
	   d5.disp();
	   System.out.println("=================================================");
	   testnon t1 = new testnon();
	   System.out.println(t1);    ///printing the address of test obj
	   System.out.println("x value of testnon class "+t1.x);
	   System.out.println("y value of testnon class "+t1.y);
	   t1.disp();
	   
	   System.out.println("main method Ended ....");
}
}
