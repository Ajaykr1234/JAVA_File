package blocks;

public class Nb2 {
	{
		System.out.println("i am a non static block1");
	}
	{
		System.out.println("i am a non static block2");
	}
  public static void main(String[] args) {
	  System.out.println("main method..");
	  
	new Nb2();
}
  {
		System.out.println("i am a non static block3");
	}
}
