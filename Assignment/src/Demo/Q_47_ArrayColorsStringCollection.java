/*Write a Java program to iterate through all elements in an array list*/
package Demo;

import java.util.ArrayList;

public class Q_47_ArrayColorsStringCollection {
	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Black");
		color.add("White");
		for (String s : color) {
			System.out.println(s);
		}
	}
}
