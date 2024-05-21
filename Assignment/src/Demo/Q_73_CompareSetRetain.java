package Demo;

import java.util.HashSet;
import java.util.Iterator;

public class Q_73_CompareSetRetain {

	public static void main(String[] args) {

		HashSet hset = new HashSet();

		hset.add("Java");
		hset.add("PHP");
		hset.add("SQL");
		hset.add(6546);
		hset.add('l');
		hset.add(true);
		hset.add(65.329);
		hset.add("MYSQL");

		Iterator itr = hset.iterator();
		System.out.println("First Element of set :");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		HashSet hset1 = new HashSet();

		hset1.add("Java");
		hset1.add("PHP");
		hset1.add("MySQL");
		hset1.add(65.46);
		hset1.add('k');
		hset1.add(true);
		hset1.add(65.329);
		hset1.add("Q-SQL");

		Iterator itr1 = hset1.iterator();
		System.out.println("\nSecond Element of set :");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		hset.retainAll(hset1);

		System.out.println("\nRetains all matching elements in the current ArrayList ");
		Iterator itr2 = hset.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
