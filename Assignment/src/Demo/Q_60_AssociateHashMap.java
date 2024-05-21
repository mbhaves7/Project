/*Write a Java program to associate the specified value with the specified key in a
Hash Map*/
package Demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map;

public class Q_60_AssociateHashMap {
	public static void main(String[] args) {

		HashMap hmap = new HashMap();

		hmap.put(1, "Java");
		hmap.put(2, "PHP");
		hmap.put(3, "SQL");
		hmap.put(4, 6546);
		hmap.put(5, 'k');
		hmap.put(6, true);
		hmap.put(7, 65.329);
		hmap.put(8, "MYSQL");

		System.out.println("\n" + hmap);
	}
}
