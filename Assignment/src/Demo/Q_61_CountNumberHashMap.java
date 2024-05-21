/*Write a Java program to count the number of key-value (size) mappings in a map.*/
package Demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q_61_CountNumberHashMap {

	public static void main(String[] args) {

		Map hmap = new HashMap();
		hmap.put(1, "Java");
		hmap.put(2.5, "PHP");
		hmap.put("Ad. Java", 666.222);
		hmap.put(4, 6546);
		hmap.put(true, 'k');
		hmap.put(6, true);
		hmap.put(null, 65.329);
		hmap.put('F', "MYSQL");

		Set set = hmap.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry m = (Entry) itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		int count = hmap.size();
		System.out.println("Count of number of mapping :" + count);

	}
}
