package threadExample;

public class T3_Sequence2Thread extends Thread {
	
	public void run() {
		
		System.out.println("Printing 1 to 50 ");
		for (int i = 50; i >=0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
