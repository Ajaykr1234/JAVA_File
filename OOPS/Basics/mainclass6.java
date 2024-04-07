class Demo7 {
    int a = 100;
    int b = 200;

}

public class mainclass6 {
    public static void main(String[] args) {
        System.out.println("main method satarted ");
        Demo7 D1 = new Demo7();
        System.out.println("the refereace memory location " + D1);
        D1.a = 500;
        D1.b = 600;
        D1 = new Demo7();
        System.out.println("D1 is refreance to memory location " + D1.a);
        System.out.println("main method ended");
    }
}
