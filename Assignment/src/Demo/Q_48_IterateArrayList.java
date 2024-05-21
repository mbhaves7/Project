/*Write a Java program to iterate through all elements in an array list*/
package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Q_48_IterateArrayList {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(1);
		list.add("Banana");
		list.add(34);
		list.add(25);
		list.add(12);
		list.add(34);
		list.add('F');
		list.add(true);
		System.out.println(list);
		list.remove(4);
		list.add(1998944);
		System.out.println(list);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
