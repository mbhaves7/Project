/*Write a Java program to print all the elements of an Array List using the position of
the elements*/
package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Q_72_PrintElementArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(12);
		list.add("java");
		list.add('g');
		list.add(234.33);
		list.add(false);

		Iterator itr = list.iterator();
		System.out.println("Element of ArrayList :");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nPrint elements of an Array List using the position are");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index position of " + i + " : " + list.get(i));
		}
	}
}
