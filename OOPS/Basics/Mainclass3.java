class Demo4 {
    int p = 10;

    void test() {
        System.out.println("test method started");
    }
}

class Mainclass3 {

public static void main(String[] args) {
      System.out.println(new Demo4().p);
       new Demo4().p=20;
       System.out.println(new Demo4().p);
       new Demo4().p=30;

        System.out.println("main method ended");
    
}

}
