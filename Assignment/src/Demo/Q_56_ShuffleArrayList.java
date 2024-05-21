/*Write a Java program to shuffle elements in an array list.
•*/
package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q_56_ShuffleArrayList {
public static void main(String[] args) {
	
	 ArrayList list = new ArrayList<>();

     list.add("Java");
		list.add("PHP");
		list.add("SQL");
		list.add("JQuery");
		list.add("HTML");
		list.add("CSS");
		list.add("MongoDB");
		list.add("MYSQL");
     System.out.println("Original  list of elelment:\n");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		Collections.shuffle(list);	
		
		System.out.println("\nAfter shuffle of element :\n");
		
		for (Object object : list) {
			System.out.println(object);
		}
		
}

}
