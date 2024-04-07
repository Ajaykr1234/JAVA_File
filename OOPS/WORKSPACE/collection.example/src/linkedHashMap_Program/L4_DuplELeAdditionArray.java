package linkedHashMap_Program;

import java.util.LinkedHashMap;

public class L4_DuplELeAdditionArray {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> l1 = new LinkedHashMap<Integer, Integer>();
		int[] arr = {4,5,4,5,6,1,2,3,4,6,6};
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			if(l1.containsKey(arr[i])) {
				l1.put(arr[i], l1.get(arr[i])+1);
				sum+=arr[i];
				
			}else {
				l1.put(arr[i], 1);
			}
			
		}
		System.out.println(l1);
		System.out.println(sum);
		
	}

}
