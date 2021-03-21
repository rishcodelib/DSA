package DSA.collectionsFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPoc {
	/*
	 * LinkedHashMAP (Allows 1 Null key and multiple null Values), non synchronized
	 * 
	 * Maintains Insertion Order
	 */
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(102, "Rahul");
		hm.put(101, "Vijay");
		
		
		
		System.out.println(hm.entrySet());
	}
	
	

}
