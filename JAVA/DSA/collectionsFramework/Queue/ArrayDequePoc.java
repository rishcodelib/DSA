package DSA.collectionsFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequePoc {
	/*
	 * ArrayDeque class implements the Deque Interface.
	 * 
	 * We Can Add or Delete Elements from both the Ends.
	 */
	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Rishabh");
		deque.add("Karan");
		deque.add("Ajay");
//		deque.remove("Karan");
		
		for(String str : deque) {
			System.out.println(str);
		}

	}

}
