package DSA.collectionsFramework.SET;

import java.util.HashSet;
import java.util.Iterator;

/*
 * SET Interface : JAVA.UTIL.PACKAGE
 * 1) Unordered set of elements 
 * 2) Doesn't Allow to store duplicate Items.
 * 3) Atmost(Maximum) 1 Null value Can be Stored.
 * 4) SET is implemented by: HashSet, LinkedHAshSet, TreeSet
 */
public class HashSetPOC {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
			
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
