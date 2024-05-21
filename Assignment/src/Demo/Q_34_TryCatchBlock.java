/*W.A.J. P to demonstrate try catch block*/

package Demo;

import java.util.Scanner;

public class Q_34_TryCatchBlock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 number");
		int a = sc.nextInt();
		System.out.println("Enter 2 number");
		int b = sc.nextInt();
		try {// try block of handle for Exception
			int c = a / b;// division for two number
			System.out.println("division of two value " + c);
		} catch (Exception e) {// catch block for error Exception
			System.out.println("Error");
		}
	}
}
