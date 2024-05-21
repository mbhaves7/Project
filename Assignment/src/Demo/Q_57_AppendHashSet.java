/*Write a Java program to append the specified element to the end of a hash set. */
package Demo;

import java.util.HashSet;
import java.util.Iterator;

public class Q_57_AppendHashSet {

	public static void main(String[] args) {
		HashSet hset = new HashSet();

		hset.add("Java");
		hset.add("PHP");
		hset.add("SQL");
		hset.add(6546);
		hset.add('k');
		hset.add(true);
		hset.add(65.329);
		hset.add("MYSQL");

		Iterator itr = hset.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		hset.add("zero");
		System.out.println("\nAfter append the specified element :");
		itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
