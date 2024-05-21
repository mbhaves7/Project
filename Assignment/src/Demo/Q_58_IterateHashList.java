/*Write a Java program to iterate through all elements in a hash list.*/
package Demo;

import java.util.HashSet;
import java.util.Iterator;

public class Q_58_IterateHashList {

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
	}

}
