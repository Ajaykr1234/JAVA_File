package classtype;

public class Demo1 {
	
	//member variable
   
	static int x=10;    //Static variable
    int y=20;			// non static variable
    		
    
    
    //member function
    
    static void test() {						//static function
    	int x=10; //local variable
    	System.out.println("test method ");
    }
    
    void disp() {								//non static function
    	int x =10; //local variable 
    	
    	System.out.println("dsplay method ");
    }
    

}