class Circle {
    double radius;
    static final double pi = 3.14;

    void diameter() {
        double dia = 2 * radius;
        System.out.println(dia);
    }

    void Area() {
        double Ar = pi * radius * radius;
        System.out.println(Ar);
    }

    void circum() {
        double circumm = 2 * pi * radius;
        System.out.println(circumm);
    }
}

public class Mainclass14 {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        C1.radius = 2.5;
        C1.diameter();
        C1.Area();
        C1.circum();
        System.out.println(".........................................................................................");
        Circle C2 = new Circle();
        C2.radius = 5.6;
        C2.diameter();
        C2.Area();
        C2.circum();
    }

}
