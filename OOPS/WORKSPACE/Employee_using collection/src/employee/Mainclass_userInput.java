package employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Mainclass_userInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many data u can store ");
		int size = sc.nextInt();
		
		ArrayList<Employee> al = new ArrayList<Employee>(size);
		
		for (int i = 0; i < al.size(); i++) {
			
			System.out.println(i);
//			al.get(i)=sc.nextInt();
			
		}
	}

}
