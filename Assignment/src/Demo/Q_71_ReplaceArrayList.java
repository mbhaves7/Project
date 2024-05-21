package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q_71_ReplaceArrayList {

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

		Collections.replaceAll(list, 'g', null);

		Iterator itr1 = list.iterator();
		System.out.println("\nReplace Element of ArrayList :");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
