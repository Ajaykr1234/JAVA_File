package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Delete_file {
	
	public static void main(String[] args) {
		File obj = new File("C:\\Users\\ajayk_dqm1o31\\Desktop\\j spider java keshava sir\\OOPS\\WORKSPACE\\File Handling\\src\\com\\filehandling\\myfile1.txt");
		try {
			obj.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println(obj.length());
		if(obj.delete()) {
			System.out.println("File deleted ");
		}else {
			System.out.println("File is not Empty so delay to deleting...");
		}
	}

}
