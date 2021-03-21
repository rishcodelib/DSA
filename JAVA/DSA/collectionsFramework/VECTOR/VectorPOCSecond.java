package DSA.collectionsFramework.VECTOR;

import java.util.Iterator;
import java.util.Vector;

public class VectorPOCSecond {
	// Used Dynamic Array to Store the data elements.
	// similar to Arraylist However it is Synchronized and Contains many methods
	// that are not a part of collection framework
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("Ayush");
		v.add("Rishabh");
		v.add("ashish");
		v.add("garima");
		v.add("neha");
		
		Iterator<String> itr = v.iterator();
	
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
