package com.filehandling;

import java.io.File;
import java.io.IOException;

public class File_method {
	
	public static void main(String[] args) {
		File obj = new File("C:\\Users\\ajayk_dqm1o31\\Desktop\\j spider java keshava sir\\OOPS\\WORKSPACE\\File Handling\\src\\com\\filehandling\\myfile1.txt");
		try {
			obj.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println(obj.getName());
		System.out.println(obj.getAbsolutePath());
		System.out.println(obj.length());
	}
	

}
