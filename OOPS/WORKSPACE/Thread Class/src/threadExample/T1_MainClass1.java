package threadExample;

public class T1_MainClass1 {
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Thread t1 = new Thread();
		System.out.println("Thread Id : "+t1.getId());
		System.out.println("Thread Name : "+t1.getName());
		System.out.println("Thread priority : "+t1.getPriority());
		
		System.out.println("=======Setting new thread Name=====");
		t1.setName("MY Thread");
		System.out.println("Thread Name : "+t1.getName());
		
		System.out.println("=======Setting new thread priority=====");
		t1.setPriority(10);
		System.out.println("Thread priority : "+t1.getPriority());
		
		t1.start();
		System.out.println("Main method ended");
		
	
	}

}
