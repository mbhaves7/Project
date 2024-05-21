/*W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
with Red? False I3.  */
package Demo;

import java.util.Scanner;

public class Q_17_StartsWith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value ");
		String st = sc.nextLine();

		boolean b = st.startsWith("Red");

		System.out.println("Start with value Red is " + b);
		sc.close();
	}
}
