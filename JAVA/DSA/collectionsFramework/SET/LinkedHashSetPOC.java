package DSA.collectionsFramework.SET;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Linkedhashset class represents the implementations of SET Interface. 
 * Extends the HASHSET class and implements SET Interface.
 * Like HashSet it Contains Unique ELEMENTS,
 * Maintains The Insertion orders and Permits the null elements
 * 
 */
public class LinkedHashSetPOC {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("ajay");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
