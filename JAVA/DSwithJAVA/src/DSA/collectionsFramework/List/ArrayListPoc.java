package DSA.collectionsFramework.List;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * JAVA GENERIC FRAMEWORK Allows only one type of Object in a collection.
 * ArrayList: is like array but has a ability to add and remove.
 */
public class ArrayListPoc {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Rishabh");
		list.add("Abhishek");
		list.add("Sahitya");
		list.add("Lovekesh");

		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
