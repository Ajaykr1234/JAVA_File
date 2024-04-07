class Graphicspoint2D {
    double X_axis;
    double Y_axis;

    void updateco_ordinate(double x, double y) {
        System.out.println("update X  and Y vlaue .......");
        X_axis = x;
        Y_axis = y;

    }

    void updatexaxisonly(double X) {
        System.out.println("updatating x vlaue only .........");
        X_axis = X;
    }

    void updateyvalueonly(double Y) {
        System.out.println("updte y value only .................");
        Y_axis = Y;

    }
}

public class Mainclass17 {
    public static void main(String[] args) {
        Graphicspoint2D G1 = new Graphicspoint2D();
        G1.updateco_ordinate(1.5, 5.8);
        System.out.println(G1.X_axis + "," + G1.Y_axis);

        G1.updatexaxisonly(2.1);
        System.out.println(+G1.X_axis + "," + G1.Y_axis);
        G1.updateyvalueonly(5.2);
        System.out.println(+G1.X_axis + "," + G1.Y_axis);

    }

}
