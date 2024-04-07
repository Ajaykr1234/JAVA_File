package threadExample;

public class T8_GenerateThread extends Thread {

	private T9_NumberGenerator ng;

	public T8_GenerateThread(T9_NumberGenerator ng) {
		this.ng = ng;
	}

	@Override
	public void run() {
//		ng.fastGenerator();
		ng.slowGenerator();
		
	}
	

}
