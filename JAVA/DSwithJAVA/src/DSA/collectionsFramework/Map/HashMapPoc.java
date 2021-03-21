package DSA.collectionsFramework.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
 * JAVA MAP Interface, 
 * Values Basis of key and Value pair.
 * MAP Contains Unique Keys.
 * but, You can have Duplicate Values.
 * Types: 
 * HashMAP (Allows Null key and Values), Non synchronized
 * LinkedHashMAP (Allows 1 Null key and multiple null Values), non synchronized
 * 
 * TreeMAP (Does not Allow Null key or value).
 * 
 */
public class HashMapPoc {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Rishabh");
		map.put(2, "Vijay");
		map.put(3, "Rahul");

		System.out.println(map.entrySet());
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	}

}
