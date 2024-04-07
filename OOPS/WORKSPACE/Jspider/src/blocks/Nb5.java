package blocks;

public class Nb5 {
	
	Nb5(){
		System.out.println("i am constructor of class Nb4");
	}
	
	static{
		System.out.println("i am a static block");
	}
	
	{
		System.out.println("i am a non Static block");
	}
	public static void main(String[] args) {
		System.out.println("main method ");
		new Nb5();
		
	}

}
