/*• Write a Java program to convert a hash set to a List/Array List. */
package Demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Q_68_ConvertHashSetArrayList {

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

		List list = new ArrayList(hset);

		Iterator itr1 = hset.iterator();
		System.out.println("\nAfter Convert HashSet to ArrayList:\n");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
