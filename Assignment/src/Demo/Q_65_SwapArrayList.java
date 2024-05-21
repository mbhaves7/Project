/*Write a Java program of swap two elements in an array list.*/
package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q_65_SwapArrayList {

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
		Collections.swap(list, 2, 5);

		Iterator itr1 = list.iterator();
		System.out.println("\nElement of ArrayList :");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
