/*• W.A.J.P to check whether a given string ends with the contents of another string.
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True */

package Demo;

import java.util.Scanner;

public class Q_16_EndWith {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value ");
		String st = sc.nextLine();

		boolean b = st.endsWith("es");

		System.out.println("end with value is " + b);
		sc.close();

	}
}
