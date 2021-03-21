package DSA.collectionsFramework.List;

import java.util.Iterator;
import java.util.Stack;

public class StackPOC{
	/*
	 * Stack is a Subclass of Vector, Implements LAST -IN - FIRST -OUT The Stack,
	 * Contains all the methods of vector class and also provides it's methods like
	 * boolean push(), boolean peek(), boolean push (object o)
	 */
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Rishabh");
		stack.pop();

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
