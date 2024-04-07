package blocks;

public class Nb4 {
	
	Nb4(){
		System.out.println("i am constructor of class Nb4");
	}
	
	{
		System.out.println("i am a non Static block");
	}
	public static void main(String[] args) {
		System.out.println("main method ");
		new Nb4();
		
	}
}
