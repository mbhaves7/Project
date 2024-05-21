/*• Write a Java program to check whether a map contains key-value mappings (empty)
or not.*/
package Demo;

import java.util.HashSet;
import java.util.Iterator;

public class Q_69_CheckEmptyOrNot {
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

		boolean empty = hset.isEmpty();
		if (empty) {
			System.out.println("\nElement is empty");
		} else {
			System.out.println("\nElement is not empty");
		}

	}

}
