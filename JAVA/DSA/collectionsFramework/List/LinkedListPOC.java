package DSA.collectionsFramework.List;

import java.util.LinkedList;

public class LinkedListPOC {
	
	// LinkedList is a Part of ComyListections Frame Work.

		// Creating Pushing, Inserting & Appending into the Linked List.
	//Head of the List 

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();

		// Adding Elements to Linked List
		myList.add("R"); // Pushing
		myList.add("S");
		myList.add("H");
		myList.add("A");
		myList.add("B");
		myList.add("H");

		myList.add(1, "I"); // Inserting In Between

		System.out.println(myList);
		myList.remove(4); // Removing or Deleting
		myList.remove("B");
		myList.removeLast(); // Appending
		myList.add("I");

		System.out.println(myList);

	}

}
