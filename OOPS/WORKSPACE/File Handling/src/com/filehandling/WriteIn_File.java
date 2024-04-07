package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteIn_File {
	public static void main(String[] args) {
		File obj = new File("C:\\Users\\ajayk_dqm1o31\\Desktop\\j spider java keshava sir\\OOPS\\WORKSPACE\\File Handling\\src\\com\\filehandling\\myfile1.txt");
		try {
			obj.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			FileWriter wrt = new FileWriter("C:\\Users\\\\ajayk_dqm1o31\\\\Desktop\\\\j spider java keshava sir\\\\OOPS\\\\WORKSPACE\\\\File Handling\\\\src\\\\com\\\\filehandling\\\\myfile1.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter yr String ");
			String str = sc.nextLine();
			wrt.write(str);
			wrt.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
