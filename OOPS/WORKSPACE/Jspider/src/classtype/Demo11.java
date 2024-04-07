package classtype;

class circle{
	double radius;
	double pi;
	double area;
	double circum;
	 
	void area(double radius) {
		double area = radius*radius;
		System.out.println("Area of a circle is "+area);
		
	}
	void circum(double radius,double pi) {
		double circum = 2* radius*pi;
		System.out.println("Area of a circle is "+circum);
		
	}
  	
}

//Q1. the radius of the circle is 1.5;
public class Demo11 {
	public static void main(String[] args) {
		
		circle c = new circle();
		
		c.radius=1.5;
		c.pi=3.14;
		
		c.area=c.radius*c.radius;
		System.out.println("area of a circle "+c.area);
		
		c.circum=2*c.pi*c.radius;
		System.out.println("circumo of a circle is "+c.circum);
		
		System.out.println("method calling statement............");
		c.area(1.5);
		c.circum(1.5,3.14);
	}

}
