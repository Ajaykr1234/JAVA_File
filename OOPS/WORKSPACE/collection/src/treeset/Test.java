package treeset;

import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		
		int[] arr = {4,4,7,5,2,1,3,2,6};
		
		TreeSet a = new TreeSet();
		
		for(int i=0; i<arr.length; i++) {
			a.add(arr[i]);
		}
		
		System.out.println(a);
		}
		
		
	}

