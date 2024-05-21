/*Write a Java program to copy one array list into another. */
package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q_55_CopyArrayList {

	public static void main(String[] args) {
		ArrayList List1 = new ArrayList();
        List1.add(1);
        List1.add(2);
        List1.add(6);
        List1.add(4);
        List1.add(5);

        // Create the destination ArrayList
        ArrayList list = new ArrayList<>();

        list.add("Java");
		list.add("PHP");
		list.add("SQL");
		list.add("JQuery");
		list.add("HTML");
		list.add("CSS");
		list.add("MongoDB");
		list.add("MYSQL");
        
		Collections.copy(list, List1);		
		
		
		System.out.println(list);
		System.out.println(List1);
	}
}
