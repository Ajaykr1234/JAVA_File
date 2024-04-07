class Demo1 {

    static int x = 20;
    static int y = 40;

    static void test() {
        System.out.println("test class is method() is running");
    }
}

class Mainclass1 {
    public static void main(String[] args) {
        System.out.println("main methos started............");

        System.out.println("X value is = " + Demo1.x);
        System.out.println("Y value is = " + Demo1.y);
        Demo1.test();

        System.out.println("after the modification of the value or after the re intilize the x and y value is ");
        Demo1.x = 100;
        Demo1.y = 500;
        System.out.println("x value is " + Demo1.x);
        System.out.println("yvalue is " + Demo1.y);

        System.out.println("main method ended...................");
    }
}