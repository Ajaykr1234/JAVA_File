package threadExample;

public class T7_seq {
	public static void main(String[] args) {
		System.out.println("Main method Started");
		T2_SequenceThread sq1 = new T2_SequenceThread();
		sq1.start();
		for (int i = 486; i < 500; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("Main method ended");
	}

}
