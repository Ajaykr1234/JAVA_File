package polymerphism_concept;


interface Shape{
	double pi= 3.14;
	 void area();
	
}
//================================
class Circle implements Shape{
	
	private double  radius;
	
	
	
	public Circle(double radius) {
		
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public void area() {
		
		System.out.println("Area of circle is "+(2*pi*radius));
		System.out.println("===================================");
		
		
	}

}


//================================
class Square implements Shape{
	
	private double  side;
	
	
	
	public Square(double side) {
		
		this.side = side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getRadius() {
		return side;
	}

	@Override
	public void area() {
		
		System.out.println("Area of Square  is "+(side*side));
		
		
	}

}

//==================================
class AreaSimulator{

	
	public void area(Shape s1) {
		s1.area();
		
	}
	
}

//=====================================


public class P2_FindArea {
	public static void main(String[] args) {
		
		Circle c = new Circle(45.2);
		Square s = new Square(4.5);
		
		AreaSimulator sia= new AreaSimulator();
		sia.area(c);
		sia.area(s);
	}
	

}
