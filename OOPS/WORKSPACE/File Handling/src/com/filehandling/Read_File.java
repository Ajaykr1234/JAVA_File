package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read_File {
	public static void main(String[] args) {
		File obj = new File("C:\\Users\\ajayk_dqm1o31\\Desktop\\j spider java keshava sir\\OOPS\\WORKSPACE\\File Handling\\src\\com\\filehandling\\myfile1.txt");
		try {
			obj.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			Scanner sc = new Scanner(obj);
			while(sc.hasNext()) {
				String res =sc.nextLine();
				System.out.println(res);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
