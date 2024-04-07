package object;

// Q1. radius of a circle is 1.5
     //entity = circle;
	//Attributes = radius 
	// Behavior = diameter, Area, circumference


class circlee{
	double radius;
	static final double pi = 3.14;
	
	void dia() {
		double dia = 2*radius;
		System.out.println("diameter of a circle is "+dia);
	}
	void area() {
		double area = pi*radius*radius;
		System.out.println("area of a circle is "+area);
	}
	void circum() {
		double circum = 2*pi*radius;
		System.out.println("circumference of a circle is "+circum);
	}
	
}

public class Circle {
	public static void main(String[] args) {
		
		circlee ce = new circlee();
		ce.radius=1.5;
		ce.dia();
		ce.area();
		ce.circum();
		System.out.println("===========================================");
		circlee ce1 = new circlee();
		ce1.radius=2.5;
		ce1.dia();
		ce1.area();
		ce1.circum();
	}

}
