package classtype;

public class Demo4_StaticMember1 {

	 public static void main(String[] args) {
		 System.out.println("main method started ....");
		    System.out.println("===========to Acces test class members============");
			System.out.println("x vlaue of test class : "+test.x);
			System.out.println("y vlaue of test class : "+test.y);
			test.disp();
			System.out.println("=After modifining the x and y value =");
			test.x=10000;
			test.y=20000;
			System.out.println("x vlaue of test class : "+test.x);
			System.out.println("y vlaue of test class : "+test.y);
			System.out.println("========================to Access test1 class member ==============");
			System.out.println("x vlaue of test1 class : "+test.x);
			System.out.println("y vlaue of test1 class : "+test.y);
			test.disp();
			System.out.println("=After modifining the x and y value =");
			test1.x=5685;
			test1.y=45866;
			System.out.println("x vlaue of test1 class : "+test.x);
			System.out.println("y vlaue of test1 class : "+test.y);
		System.out.println("main method Ended ....");
	}
}
