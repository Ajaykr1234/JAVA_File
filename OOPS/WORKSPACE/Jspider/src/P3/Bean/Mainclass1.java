package P3.Bean;

import java.util.Scanner;

public class Mainclass1 {
	public static void main(String[] args) {
		System.out.println("main method running");
		
		
		Employee  emp= new Employee(123,"ajay",400);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		System.out.println("After setting all the thing");
		emp.setId(321);
		emp.setName("Ajay kumar");
		emp.setSalary(500);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		
		
		
		
		System.out.println("main method ended");
	}

}
