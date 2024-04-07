public class Mainclass2 {
    public static void main(String[] args) {
        System.out.println("Main method satrted..................");

        //crating object using parameterized constructor
        
        Demo2 D2 = new Demo2(12,12.5);
        System.out.println("a value is = " +D2.a);
        System.out.println("b value is "+D2.b);


        Demo2 D3 = new Demo2(45,45.5);
        System.out.println("a value is = "+D3.a);
           System.out.println("b value is = "+D3.b);
        
        System.out.println("main method ended...................");
    }
    
}
