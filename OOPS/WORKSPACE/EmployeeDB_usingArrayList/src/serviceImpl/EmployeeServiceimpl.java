package serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import entity.Employee;
import service.EmployeeService;

public class EmployeeServiceimpl implements EmployeeService {

	Scanner sc = new Scanner(System.in);

	// creating dumy memory
	ArrayList<Employee> l1 = new ArrayList<Employee>();

	@Override
	public void addEmp() {
		System.out.println("Running...........!!!");
		System.out.println("=============Enter Employee details===========");
		System.out.println("enter employee id:");
		int eId = sc.nextInt();
		System.out.println("Enter employee Name");
		String eName = sc.next();
		System.out.println("Enter the Employee Designation");
		String eDesignation = sc.next();
		System.out.println("Enter the Employee Salary");
		double eSal = sc.nextDouble();
		System.out.println("Enter the Employee phone no");
		long ePhone = sc.nextLong();
		System.out.println("Enter the Employee Age ");
		int eAge = sc.nextInt();

		l1.add(new Employee(eId, eName, eDesignation, eSal, ePhone, eAge));
		System.out.println("Employee Added SuccessFully..........!!!");

	}

	@Override
	public void getAllEmp() {
		System.out.println("fetching Employee details");
		if (l1.isEmpty() == true) {
			System.out.println("There are no employee in  Company");
		} else {
			for (Employee details : l1) {
				System.out.println(details);

			}
		}

	}

	@Override
	public void getEmpByEid() {
		System.out.println("Enter Employee ID : ");
		int eid = sc.nextInt();
		System.out.println("searching employee by id.......");
		boolean flag = false;

		for (Employee emp : l1) {
			if (emp.geteId() == eid) {
				System.out.println(emp);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Eid not found......");
		}

	}

	@Override
	public void findEmpByRangeSal() {
		System.out.println("Enter the Lowest range :");
		double lowsal = sc.nextInt();
		System.out.println("Enter  the Heighest range :");
		double higsal = sc.nextInt();
		System.out.println("Searching..................");
		boolean flag = false;
		for (Employee emp : l1) {
			if ((emp.geteSal() >= lowsal) && (emp.geteSal() <= higsal)) {
				System.out.println(emp);
					flag = true;
			}
		}
		if(flag==false) {
			System.out.println("Employee not found such as range....");
		}

	}

	@Override
	public void getEmpBysal() {
		System.out.println("Enter Employee salary ");
		double sal = sc.nextDouble();
		boolean flag = false;
		for (Employee emp : l1) {
			if(emp.geteSal()==sal) {
				System.out.println(emp);
				flag = true;
				break;
			}
		 
		}
		
	}

	@Override
	public void findEmpbyDesgn() {
		System.out.println("Enter Employee Desiganation ");
		String  deg = sc.next();
		for (Employee emp : l1) {
			if(emp.geteDesignation()==deg) {
				System.out.println(emp);
				break;
			}
			
		}
		
	}

	@Override
	public void findEmpByAge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmpByEid() {
		System.out.println("Enter Employee eid : ");
		int eid = sc.nextInt();
		System.out.println("Searching.......");
		Employee e = null;
		for (Employee emp : l1) {
			if(emp.geteId()==eid) {
				e=emp;
				break;
			}
			
		}
		if (e!=null) {
			System.out.println("======Menu for Update============");
			System.out.println("1.Name\n2.salary\n3.Age\n4.Designation\n5.Phone Number");
			System.out.println("Enter your option: ");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter Employee new Name : ");
				sc.nextLine();
				String name = sc.nextLine();
				e.seteName(name);
				System.out.println(" Updated Name Successfully...");
				break;
			case 2:
				System.out.println("Enter Employee new Salary : ");
				Double sal = sc.nextDouble();
				e.seteSal(sal);;
				System.out.println(" Updated Salary Successfully...");
				break;
			case 3:
				System.out.println("Enter Employee new Age : ");
				int  age = sc.nextInt();
				e.seteSal(age);;
				System.out.println(" Updated Age Successfully...");
				break;
			case 4:
				System.out.println("Enter Employee new Degisnation : ");
				sc.nextLine();
				String deg = sc.nextLine();
				e.seteDesignation(deg);
				System.out.println(" Updated Degisnation Successfully...");
				break;
			case 5:
				System.out.println("Enter Employee new Phone Number : ");
				long  number = sc.nextLong();
				e.setePhone(number);
				System.out.println(" Updated Number  Successfully...");
				break;
			default:System.out.println("Invalid choice Plese Enter valid Inpute..?");
				break;
			}
			
		} else {
			System.out.println("Employee "+eid+" not found");
		}
		
		
	}

	@Override
	
	
	public void removeEmpByEid() {
		boolean flag = false;
		System.out.println("Enter the Eid : ");
		int eid = sc.nextInt();
		for(int i=0; i<l1.size(); i++) {
			if(eid==l1.get(i).geteId()) {
				l1.remove(i);
				System.out.println("Employee Remove......");
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Employee not found....!!!");
		}
	}

    

}
