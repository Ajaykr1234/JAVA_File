package stringclasses;

//immutable class

class Demo1{
	final String  name;
	final  int age;
	
	public Demo1( String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Demo1 [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class S1_Immutable_class {
	
	public static void main(String[] args) {
		
	
		Demo1 d1 = new Demo1("ajay", 45);
		System.out.println(d1);
		
		
	}

}
