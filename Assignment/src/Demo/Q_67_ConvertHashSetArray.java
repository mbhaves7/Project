/*• Write a Java program to convert a hash set to an array.*/

package Demo;

import java.util.HashSet;
import java.util.Iterator;

public class Q_67_ConvertHashSetArray {
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

		String[] array = (String[]) hset.toArray(new String[hset.size()]);

		for (String string : array) {
			System.out.println(string);
		}

	}

}
