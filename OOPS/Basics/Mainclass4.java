class Demo5 {
    int p = 500;

    void test() {
        System.out.println("runnung test class");
    }
}

public class Mainclass4 {
    public static void main(String[] args) {
        System.out.println("Main mehtod Started");

        Demo5 D1; // Referance variable declration
        D1 = new Demo5(); // Assinging object to D1,D1 is a name of object

        System.out.println("p value is " + D1.p);
        D1.test();

        System.out.println("main method endede");
    }
}
