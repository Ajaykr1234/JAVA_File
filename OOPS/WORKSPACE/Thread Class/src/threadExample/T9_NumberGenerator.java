package threadExample;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class T9_NumberGenerator {

	private int start;
	private int end;

	public T9_NumberGenerator(int start, int end) {
		this.start = start;
		this.end = end;
	}

	synchronized void slowGenerator() {

		String name = Thread.currentThread().getName();
		for (int i = start; i < end; i++) {
			System.out.println(name + " ! " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}
	
	void fastGenerator() {
		String name = Thread.currentThread().getName();
		for (int i = start; i < end; i++) {
			System.out.println(name + " ! " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

}
