package DSA.collectionsFramework.Queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * Queue: Interface (FIRST IN FIRST OUT)
 * 
 * IT can be defined as an ordered list that is used to hold the elements which are about to be processed. 
 * Various Classes that implements Queue Interface are:
 * 
 * Priority Queue
 * Deque :  
 * 	Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side.
 *  Deque stands for a double-ended queue which enables us to perform the operations at both the ends.Ω
 * 
 * ArrayDeque
 */

public class PrioQueuePOC {
	/*
	 * Priority Queue: Holds the elements or objects which are to be processed by
	 * their priorities.
	 * Does not allow Null Values to be stored in the queue.
	 */
	public static void main(String[] args) {

		PriorityQueue<String> q = new PriorityQueue<String>();

		q.add("Rishabh Aggarwal");
		q.add("Sahitya Ratan");
		q.add("Kamal Nanda");
		q.add("Lovekesh garg");
		
		System.out.println("head " + q.element());
		System.out.println("head " + q.peek());

		System.out.println("Iterating the Elements of Queue ");

		Iterator<String> itr = q.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		q.remove();
		q.poll();
		System.out.println("after Removing two elements:");
		
		Iterator<String> itr2 = q.iterator();
		
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
	};

}
