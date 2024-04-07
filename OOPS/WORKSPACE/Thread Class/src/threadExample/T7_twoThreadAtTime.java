package threadExample;

public class T7_twoThreadAtTime {
	public static void main(String[] args) {
		T2_SequenceThread sq1 = new T2_SequenceThread();
		sq1.setName("thread1");
		System.out.println(sq1.getName());
		T3_Sequence2Thread sq2 = new T3_Sequence2Thread();
		sq2.setName("thread2");
		System.out.println(sq2.getName());
		
		
		sq1.start();
		sq2.start();
	}

}
