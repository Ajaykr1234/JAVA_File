public class Demo4 {
   int x;
   double y;
   
   
   Demo4(){
    System.out.println("running demo 4..");
    int x=20;
    int y=30;
   }

   Demo4(int x){
     this.x=x;
   }
    Demo4(double y){
        this.y = y ;

    }
    
    Demo4(int x,double y){
        this.x=x;
        this.y=y;
    }
    
    Demo4(double y,int x){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("x value is :- " +x);
        System.out.println("x value is :- " +y);
    }

   } 
    

