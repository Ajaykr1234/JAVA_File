package threadExample;

public class test {

	public static void main(String[] args) {

		Thread t = new Thread();
		System.out.println(t);
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setName("my thres ");
		System.out.println(t.getName());
	}

}