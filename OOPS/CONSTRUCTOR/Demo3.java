public class Demo3 {
    int x=10;    //non static variable
    void display(){
        int x = 20;
        System.out.println("non Static value x is  "+this.x);
        System.out.println("local variable x is  "+x  );
        System.out.println("coping local variable to non static variable ");
        this.x=x;
       System.out.println("non Static value x is  "+this.x);
        
    }
    
}
