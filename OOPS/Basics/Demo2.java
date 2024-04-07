class Demo2 {
    static int x = 45;
    static int y = 85;

    static void disp() {
        System.out.println("disp method ended");
    }

}

class Demo3 {
    public static void test() {
        System.out.println("test class running ");

        System.out.println("the value of x " + Demo2.x);
        System.out.println("the value of x " + Demo2.y);

        Demo2.disp();

        Demo2.x = 500;
    }
}
