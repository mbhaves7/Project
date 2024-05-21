/*W.A.J.P to concatenate a given string to the end of another string */

package Demo;

import java.util.Scanner;

public class Q_14_Concatenate {

	public static void main(String[] args) {

		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your First name");
		String s = sc.nextLine();

		System.out.println("enter your last name");
		String x = sc.nextLine();
		String add = s + " " + x;// concatenate two name

		String st = name.concat(add);

		System.out.println("Your full name is " + st);// print add two name
	}
}
