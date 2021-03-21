package DSA.collectionsFramework.Map;

import java.util.TreeMap;

/*
 * TreeMap:
 * Value based on the key 
 * implements the NavigableMap Interface Extends Abstract Map Class
 * Only Unique elements
 * Cannot have null key but can have multiple null values
 * Not Synchronized
 * Maintains Ascending Order.
 */
public class TreeMapPOC {
	public static void main(String[] args) {

		TreeMap<Integer,String> map = new TreeMap<Integer, String>();
		map.put(100, "Rishabh");
		map.put(101, "Rishabh");
		map.put(102, "Rishabh");
		map.put(104, "Rishabh");
		map.put(103, "Rishabh");
		
		
	System.out.println(map.entrySet());
	}

}
