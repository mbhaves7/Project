/*Write a Java program to get a collection view of the values contained in this map.*/
package Demo;

import java.util.HashMap;

public class Q_74_GetCollectionViewMap {

	public static void main(String[] args) {

		HashMap hmap = new HashMap();

		hmap.put(1, 'J');
		hmap.put(true, "JAVA");
		hmap.put('A', 'S');
		hmap.put("C++", 96.9);
		hmap.put(null, true);
		hmap.put(987, 7598);

		
		System.out.println("\n" + hmap.values());
	}

}
