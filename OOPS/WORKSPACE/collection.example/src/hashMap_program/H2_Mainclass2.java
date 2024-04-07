package hashMap_program;
import java.util.HashMap;

public class H2_Mainclass2 {
	
	public static void main(String[] args) {
		
		HashMap<Character ,String> h2 = new HashMap<Character ,String>();
		h2.put('a', "Apple");
		h2.put('b', "Ball");
		h2.put('c', "Cat");
		h2.put('d', "Dog");
		System.out.println(h2);
		h2.put('a', "Aeroplane");
		System.out.println(h2);
	}

}
