package threadExample;

import java.lang.management.GarbageCollectorMXBean;

public class T6_CurrentThread {

	public static void main(String[] args) {
		System.out.println("Main method Started");

		
		Thread curth = Thread.currentThread();
		System.out.println("Current thread name : " + curth.getName());
		System.out.println("Current thread id : " + curth.getId());
		System.out.println("Thread priority : " + curth.getPriority());
		
	
		
		System.out.println("Main method ended");

	}

}
