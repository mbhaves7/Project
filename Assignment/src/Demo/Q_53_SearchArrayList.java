/*Write a Java program to search an element in an array list. */

package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q_53_SearchArrayList {

	public static void main(String[] args) {

		List list1 = new ArrayList();
		list1.add("Java");
		list1.add("PHP");
		list1.add("SQL");
		list1.add("JQuery");
		list1.add("HTML");
		list1.add("CSS");
		System.out.println("ArrayList of Element :");
		Iterator itr = list1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nSearch new array List of element :");

		if (list1.contains("SQL")) {
			System.out.println("Found Element");
		} else {
			System.out.println("not Found Element");
		}
	}
}
