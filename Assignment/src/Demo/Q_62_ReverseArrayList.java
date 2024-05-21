/*Write a Java program to reverse elements in an array list.*/
package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q_62_ReverseArrayList {

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

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		Collections.reverse(list);

		System.out.println("\nreverse order Array :\n");

		Iterator itr1 = list.iterator();

		while (itr1.hasNext()) {

			System.out.println(itr1.next());
		}

	}

}
