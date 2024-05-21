/*Write a Java program to compare two array lists. */
package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q_64_CompareArrayList {

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

		list2.add(21);
		list2.add("avaja");
		list2.add('g');
		list2.add(234.33);
		list2.add(true);
		list2.add(122354);
		list2.add("new data");

		Iterator itr1 = list.iterator();
		System.out.println("\nElement of ArrayList :");
		
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}

		
		if (list.equals(list2)) {
			
			System.out.println("\nBoth arrayList is equal");
		} else {
			System.out.println("\nBoth arrayList is not equal");
			
		}
	}

}
