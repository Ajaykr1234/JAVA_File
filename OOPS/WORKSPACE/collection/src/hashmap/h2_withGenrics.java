package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class h2_withGenrics {

	public static void main(String[] args) {

		HashMap<Character, String> hs = new HashMap<Character, String>();

		hs.put('r', "raja");

		hs.put('z', "zebra");

		hs.put('a', "ajay");

		hs.put('n', "niraj");

		System.out.println(hs);

		System.out.println(hs.get('z'));

	}

}
