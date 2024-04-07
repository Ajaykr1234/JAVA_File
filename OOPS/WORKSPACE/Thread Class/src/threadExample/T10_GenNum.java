package threadExample;

public class T10_GenNum {
	
	public static void main(String[] args) {
		 T9_NumberGenerator ng = new 	 T9_NumberGenerator(1,10);
		 T8_GenerateThread gt1 = new T8_GenerateThread(ng);
		 T8_GenerateThread gt2 = new T8_GenerateThread(ng);
		 T8_GenerateThread gt3 = new T8_GenerateThread(ng);
		 
		 gt1.getName();
		 gt2.getName();
		 gt3.getName();
		 
		 gt1.start();
		 gt2.start();
		 gt3.start();
	}

}
