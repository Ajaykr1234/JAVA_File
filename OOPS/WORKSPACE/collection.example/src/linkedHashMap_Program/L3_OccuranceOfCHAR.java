package linkedHashMap_Program;

import java.util.LinkedHashMap;

public class L3_OccuranceOfCHAR {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Character, Integer> l1 = new LinkedHashMap<Character, Integer>();
		String s = "hello how are you";
		
		for (int i = 0; i < s.length(); i++) {
			if(l1.containsKey(s.charAt(i))) {
				l1.put(s.charAt(i), l1.get(s.charAt(i))+1);
			}
			else {
				l1.put(s.charAt(i), 1);
			}
		}
		System.out.println(l1);
		
		for(Character ele: l1.keySet()) {
			System.out.println(ele+" "+l1.get(ele));
		}
	}

}
