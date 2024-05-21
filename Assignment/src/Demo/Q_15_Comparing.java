/*W.A.J.P to compare a given string to the specified character sequence. Comparing
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
 */

package Demo;

import java.util.Scanner;

public class Q_15_Comparing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 value ");
		String st = sc.nextLine();
		System.out.println("enter  2 value ");
		String st1 = sc.nextLine();
		boolean b = st.equals(st1);

		System.out.println("compair to value " + b); // print compare two value

	}
}
