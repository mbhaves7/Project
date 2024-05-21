/*• Write a Java program to increase the size of an array list.*/
package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Q_70_IncreaseArrayList {

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
		System.out.println("\nincrease the size of an array list :");
		list.ensureCapacity(30);
		list.add("C++");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
