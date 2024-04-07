package StudentServiceImp;

import java.util.ArrayList;
import java.util.Scanner;

import Student.Student;
import StudentService.Student_service;

public class  StudentServiceImp implements Student_service {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Student> st = new ArrayList<Student>();

	@Override
	public void addStud() {
		System.out.println("Enter student Roll Number: ");
		int  erollno = sc.nextInt();
		
		System.out.println("Enter student Name: ");
		String  sName = sc.next();
		
		System.out.println("Enter student Father's Name: ");
	      String  sFatherName = sc.next();
	     
	     System.out.println("Enter student Mother's Name: ");
	      String  sMotherName = sc.next();
	      
	    System.out.println("Enter student Roll Number: "); 
	      int sage = sc.nextInt();
	      
	    System.out.println("Enter student Phone Number: ");  
	    long ephone = sc.nextLong();
	    
	    System.out.println("Enter student Address: "); 
	    String  sAddress = sc.next();
	    
	    st.add(new Student( erollno,sName, sFatherName,sMotherName,sage, ephone, sAddress));
	    System.out.println("Added succesfull...........");
		
		
	}

	@Override
	public void remStud() {
		System.out.println("Enter yr Index number to delete....");
		int n = sc.nextInt();
		try {
			if(st.get(n)!=null)
				st.remove(n);
			System.out.println("Delete Successful......");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Data is not present in index no "+n);
		}
		for (int i = 0; i < st.size(); i++) {
		
			st.get(i);
			
		}
		}
	

	@Override
	public void getAllStud() {
		
		if(st.isEmpty()==true) {
			System.out.println("there is no student in Institute");
		}else {
			for (Student stud : st) {
				System.out.println(stud);
			}
		}
		
	}

	@Override
	public void getRollno() {
		
		
	}
   
	
	
	
	
	

}
