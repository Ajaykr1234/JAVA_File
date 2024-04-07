class Demo9 {
    static int a = 100;
    int b = 200;

    static void test() {
        System.out.println("test function stated...........");
    }

    void desp() {
        System.out.println("desp function stated...........");
    }
}

class Mainclass9 {
    public static void main(String[] args) {
        System.out.println("main method stated...........");
        System.out.println("access the static and no_Static member from class");
        System.out.println(Demo9.a);
          Demo9.test();
        Demo9 D9 = new Demo9();
               System.out.println(D9.b);
      
        D9.desp();
          System.out.println("main method ended...........");
    }
}