package DSA.collectionsFramework.SET;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * SORTED SET: Is the Alternate interface that provides a total ordering on it's elements. 
 * THe elements of the sorted-set are arranged in the increasing (Ascending) order.
 * The SortedSet Provides the additional Method that inhibit the natural ordering of the elements.
 * 
 * TREESET: Class implements SET Interface that uses Tree for Storage. 
 * 
 * Like HASHSET, TREE Set also contains Unique elements 
 * However, The access and retrieval time or Tree SET is Quite Fast. 
 * THe elements in TREESET stored in ascending Order.
 * 
 */
public class TreeSetPOC {
	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
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
