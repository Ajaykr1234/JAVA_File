package doc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class DocMain {
	Scanner sc = new Scanner(System.in);
	
	public void studypoolMain() throws IOException {
		System.out.println("==============Welcome to StudyPool=====================");
		System.out.println("Studypool is an online platform that provides a marketplace for students to receive academic help and tutoring.\n1.Academic Assistance Marketplace:\n\t Studypool operates as a marketplace where students can seek help with their academic assignments, questions, and homework. They can connect with expert tutors, educators, and subject matter experts.");
		FileReader f1 = new FileReader("C:\\Users\\ajayk_dqm1o31\\Desktop\\WebDevelopment\\java.txt");
		BufferedReader br = new BufferedReader(f1);
		System.out.println("SI no\tSubject\t \t Author+\t \tPrice");
		System.out.println("01\tjava\tJames Gosling\t\t20000");
		System.out.println("02\tjava\tJames Gosling\t20000");
		System.out.println("03\tjava\tJames Gosling\t20000");
		System.out.println("04\tjava\tJames Gosling\t20000");
		System.out.println("05\tjava\tJames Gosling\t20000");
		System.out.println("06 for Exit");
		int option = sc.nextInt();
		
//		while(true) {
			switch (option) {
			case 1:
				System.out.println("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.\n It is intended to let application developers write once, and run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. \nJava was first released in 1995 and is widely used for developing applications for desktop, web, and mobile devices.\n Java is known for its simplicity, robustness, and security features, making it a popular choice for enterprise-level applications.");
				while(br.readLine()!=null) {
				System.out.println(br.readLine());
				}
				break;
			case 2:
				System.out.println("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.\n It is intended to let application developers write once, and run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. \nJava was first released in 1995 and is widely used for developing applications for desktop, web, and mobile devices.\n Java is known for its simplicity, robustness, and security features, making it a popular choice for enterprise-level applications.");
				
				break;
			case 3:
				System.out.println("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.\n It is intended to let application developers write once, and run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. \nJava was first released in 1995 and is widely used for developing applications for desktop, web, and mobile devices.\n Java is known for its simplicity, robustness, and security features, making it a popular choice for enterprise-level applications.");
				
				break;
			case 4:
				System.out.println("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.\n It is intended to let application developers write once, and run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. \nJava was first released in 1995 and is widely used for developing applications for desktop, web, and mobile devices.\n Java is known for its simplicity, robustness, and security features, making it a popular choice for enterprise-level applications.");
				
				break;
			case 5:
				System.out.println("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.\n It is intended to let application developers write once, and run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. \nJava was first released in 1995 and is widely used for developing applications for desktop, web, and mobile devices.\n Java is known for its simplicity, robustness, and security features, making it a popular choice for enterprise-level applications.");
				
				break;	
			case 6 :
				System.exit(0);
			default:System.out.println("Invalid choice");
				break;
			}
		}
//	}

}
