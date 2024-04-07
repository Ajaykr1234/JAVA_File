class GPS {
    double longitute;
    double latitude;
    String Direction;

    void updateLangiLatiDir(double lo, double la, String Dir) {
        System.out.println("updating longitude,latitude and direction");

        longitute = lo;
        latitude = la;
        Direction = Dir;

    }

    void updateLangiLati(double longi, double lati) {
        System.out.println("updating longitude.............................");

        longitute = longi;
        latitude = lati;

    }

    void updateLangiDir(double lo, String D) {
        System.out.println("updating longitude and direction..................");

        longitute = lo;
        Direction = D;

    }

    void updateLatiDir(double la, String D1) {
        System.out.println("updating latitude and direction......................");

        longitute = la;
        Direction = D1;

    }

    void updateLangi(double longit) {
        System.out.println("updating longitude.........................");

        longitute = longit;

    }

    void updateLati(double la) {
        System.out.println("updating latitude.................................");

        longitute = la;

    }

    void updateDir(String Dir1) {
        System.out.println("updating  direction..............................");

        Direction = Dir1;

    }

    void function() {
        System.out.println(longitute);
        System.out.println(latitude);
        System.out.println(Direction);
    }
}

public class Mainclass18 {
    public static void main(String[] args) {
        GPS G1 = new GPS();

        G1.updateLangiLatiDir(12.2, 45.2, "E");
        System.out.println(G1.longitute);
        System.out.println(G1.latitude);
        System.out.println(G1.Direction);

        G1.updateLangiLati(5.2, 8.6);
        System.out.println(G1.longitute);
        System.out.println(G1.latitude);
        System.out.println(G1.Direction);

        G1.updateLangiDir(80.1, "w");
        System.out.println(G1.longitute);
        System.out.println(G1.latitude);
        System.out.println(G1.Direction);

        G1.updateLatiDir(-37, "N");
        G1.function();

        G1.updateLangi(3.6);
        G1.function();

        G1.updateLati(5.6);
        G1.function();
        
        G1.updateDir("s");
        G1.function();

    }

}