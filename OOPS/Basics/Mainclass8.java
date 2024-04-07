class Demo8 {
    int a = 50;
    int b = 60;
}

public class Mainclass8 {
    public static void main(String[] args) {
        System.out.println("main method Started");
        Demo8 D8 = new Demo8();
        Demo8 D9 = D8;
        D9.a = 100;
        D9.b = 600;
        System.out.println("a  value using d8 is" + D8.a);
        System.out.println("b  value using d8 is" + D8.b);
        System.out.println(D8);
        System.out.println(D9);
    }

}
