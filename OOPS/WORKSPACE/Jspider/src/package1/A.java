package package1;

public class A {

}

//can two/more diff package have same class name 
//ans yes class b also present in package2
 class B {

}

 
 class C{
	 
	 
 }
 
 
 // how to identify while creating  the object of same class which is present in different package 
 
 // for example class B AND  class C both are present in package2 and package3
 
 class mainclass{
    public static void main(String[] args) {
		
    	
    	package2.B b2 = new package2.B();
    	package3.B b3 = new package3.B();  //Fully qualified class name
    	
    	package2.C c2 = new package2.C();
    	package3.C c3 = new package3.C();
    }
 }
    	
    	/*if u want to Access the class from one package to another package then then import package 
    	
    		package package1;
    		import package2.B;
    	 	import package3.B;
    	 	import package2.C;
    	    import package3.C;
    	 class mainclass1{
    		    public static void main(String[] args) {
    				
    		    	
    		    	B b2 = B();
    		    	 b3 = new B(); 
    		    	
    		    	C c2 = new C();
    		    	C c3 = newC(); 
    		    	}
    		    	}  */
	
 