package threadExample;

public class T2_SequenceMain {
	public static void main(String[] args) {
		System.out.println("Main method Started");

		T2_SequenceThread sq1 = new T2_SequenceThread();
		T2_SequenceThread sq2 = new T2_SequenceThread();

		sq1.start();
		sq2.start();

		System.out.println("Main method Ended");
	}

}
