package arrayList_program;

import java.util.ArrayList;
import java.util.Iterator;

public class A3_CommonPreFIx {
	public static void main(String[] args) {
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add(null);
		
		String s1 = "abcdef";
		String s2 = "abcigj";
		String empt="";
		int n = s1.length()>s2.length()?s1.length():s2.length();
		
		
		
		for (int i = 0; i < n; i++) {
			
				if(s1.charAt(i)==s2.charAt(i)) {
					empt +=s1.charAt(i);
					
				}else {
					break;
				}
				
			}
			System.out.println(empt.length()==0?-1:empt);
	}

}
