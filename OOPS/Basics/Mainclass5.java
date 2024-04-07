class Demo6 {
    int p = 100;
    int q = 200;
}

public class Mainclass5 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo6 D1 = new Demo6();
        Demo6 D2 = new Demo6();
        System.out.println("Address of the object");
        System.out.println(D1); /// it will print address
        System.out.println(D2);
        System.out.println("...................................................");
        System.out.println("1st object p vlaue is = " + D1.p);
        System.out.println("1st object q vlaue is = " + D1.q);
        System.out.println("1st object p vlaue is = " + D2.p);
        System.out.println("2st object q vlaue is = " + D2.q);

        System.out.println(
                "...............................................................................................");

        // after reintilization of the p and p value is
        D1.p = 500;
        D1.q = 100;
        D2.p = 2000;
        D2.q = 4000;
        System.out.println("1st object p vlaue is = " + D1.p);
        System.out.println("1st object q vlaue is = " + D1.q);
        System.out.println("1st object p vlaue is = " + D2.p);
        System.out.println("2st object q vlaue is = " + D2.q);

    }
}
