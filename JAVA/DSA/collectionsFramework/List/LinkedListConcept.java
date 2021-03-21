package DSA.collectionsFramework.List;

import java.util.LinkedList;

public class LinkedListConcept {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_value) {
		Node new_node = new Node(new_value);
		new_node.next = head;
		head = new_node;
	}

	public void insertAt(Node prev_node, int new_value) {
		if (prev_node == null) {
			System.out.println("Prev Node Seems to be empty");
			return;
		}
		Node new_node = new Node(new_value);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void Append(int new_value) {

		Node new_node = new Node(new_value);
		if (head == null) {
			head = new Node(new_value);
			return;
		} else {
			new_node.next = null;
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
			return;
		}
	}

	public void printlist() {
		Node myNode = head;
		while (myNode != null) {
			System.out.println(myNode.data  + " ");
			myNode = myNode.next;
		}

	}

	public static void main(String[] args) {

		LinkedListConcept llist = new LinkedListConcept();
		llist.Append(5);
		llist.push(6);
		llist.printlist();
	}
}
