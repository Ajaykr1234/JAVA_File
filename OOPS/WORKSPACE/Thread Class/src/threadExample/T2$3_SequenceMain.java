package threadExample;

public class T2$3_SequenceMain {
	
	public static void main(String[] args) {
		System.out.println("Main method Started");

		T2_SequenceThread sq1 = new T2_SequenceThread();
		T3_Sequence2Thread sq2 = new T3_Sequence2Thread();

		sq1.start();
		sq2.start();

		System.out.println("Main method Ended");
	}

}
