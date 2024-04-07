class Pen {

    String color;
    String Brand;
    double price;

}

public class Mainclass10 {
    public static void main(String[] args) {
        System.out.println("main method started.........................................");
        Pen P1 = new Pen();
        P1.color = "blue";
        P1.Brand = "cello";
        P1.price = 100.0;
        System.out.println(" color of P1 is = " + P1.color);
        System.out.println(" brand of P1 is = " + P1.Brand);
        System.out.println("price of the P1 is = " + P1.price);
        System.out.println("........................................................................................");
        Pen P2 = new Pen();
        P2.color = "red";
        P2.Brand = "reynolds";
        P2.price = 15.0;
        System.out.println(" color of P2 is = " + P2.color);
        
        System.out.println(" brand of P2 is = " + P2.Brand);
        System.out.println("price of the P2 is = " + P2.price);
        System.out.println("main method ended........................");

    }

}
