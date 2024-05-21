/*• Write a Java program to join two array lists.*/
package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q_66_JoinArrayList {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(12);
		list.add("java");
		list.add('g');
		list.add(234.33);
		list.add(false);
		list.add(122354);
		list.add("new data");

		Iterator itr = list.iterator();
		System.out.println("Element of ArrayList :");
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		List list2 = new ArrayList();

		list2.add(999);
		list2.add("C++");
		list2.add('A');
		list2.add(null);
		list2.add(true);
		list2.add(122.354);
		list2.add(false);

		Iterator itr1 = list.iterator();
		System.out.println("\nElement of ArrayList :");

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		list.addAll(list2);

		Iterator itr2 = list.iterator();
		System.out.println("\nJoin two Array :");

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}
}
