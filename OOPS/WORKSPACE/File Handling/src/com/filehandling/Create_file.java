package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Create_file {
	public static void main(String[] args) {
		
//		File obj = new File("myFile.text");
		File obj = new File("C:\\Users\\ajayk_dqm1o31\\Desktop\\j spider java keshava sir\\OOPS\\WORKSPACE\\File Handling\\src\\com\\filehandling\\myfile1.txt");
		try {
			obj.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
