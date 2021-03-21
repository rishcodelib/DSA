package DSA.collectionsFramework.VECTOR;

import java.util.Vector;

// Size implements a grow-able array
// size can grow or shrink as need to accommodate items
// Vector optimize the storage b
// vector is synchronized
// member of collection framework.
public class VectorPOC {

	public static void main(String[] args) {

		int n = 5;
// Declaring Vector and Initializing with size n
		Vector<Integer> v = new Vector <Integer> (n);
		
// appending new elements at the end of the vector
		for(int i = 1; i <=n; i++) {
			v.add(i);
		}
		System.out.println(v);
		v.remove(3);
		
		//Display After Deletion
		System.out.println(v);
		
		for(int i = 0; i <v.size(); i++) {
			System.out.println(v.get(i) + " ");
		}
	}
}
