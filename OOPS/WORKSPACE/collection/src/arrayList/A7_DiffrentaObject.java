package arrayList;

class Pen {

	private String name;
	private String brandname;
	private double cost;

	public Pen(String name, String brandname, double cost) {
		super();
		this.name = name;
		this.brandname = brandname;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Pen [name=" + name + ", brandname=" + brandname + ", cost=" + cost + "]";
	}

}

//=================

class Employee {
	private int id;
	private String name;
	private double sal;

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}
//================

class Book {
	private String name;
	private String AuthorName;
	private double price;

	public Book(String name, String authorName, double price) {
		super();
		this.name = name;
		AuthorName = authorName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", AuthorName=" + AuthorName + ", price=" + price + "]";
	}

}
//=================

class Student {

	private String name;
	private int id;
	private double marks;

	public Student(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}

}

//================

class Food {
	private String Dishname;

	private String resturantname;

	private double price;

	@Override
	public String toString() {
		return "Food [Dishname=" + Dishname + ", resturantname=" + resturantname + ", price=" + price + "]";
	}

	public Food(String dishname, String resturantname, double price) {
		super();
		Dishname = dishname;
		this.resturantname = resturantname;
		this.price = price;
	}
}

//=========================
public class A7_DiffrentaObject {

}
