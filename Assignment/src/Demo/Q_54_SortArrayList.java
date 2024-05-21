/*Write a Java program to sort a given array list*/
package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q_54_SortArrayList {
	public static void main(String[] args) {
		List list2 = new ArrayList();

		list2.add("Java");
		list2.add("PHP");
		list2.add("SQL");
		list2.add("JQuery");
		list2.add("HTML");
		list2.add("CSS");
		System.out.println("ArrayList of Element Before Sorting:\n");
		Iterator itr = list2.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Collections.sort(list2.reversed());

		System.out.println("\nArrayList of Element after Sorting:\n" );
		Iterator itr1 = list2.iterator();
		
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
}
