/*W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic
O/PException in thread main java. Lang. Arithmetic Exception:/ by zero*/

package Demo;

import java.util.Scanner;

public class Q_38_CommandLineCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try { // try block of handle for Exception
			System.out.println("Enter First Number ");
			int a = sc.nextInt();
			System.out.println("Enter Second Number");
			int b = sc.nextInt();

			int c = a / b;// division for two number

			System.out.println("Division of two number is " + c);
		} catch (ArithmeticException e) {// catch block for Exception
			System.out.println("denominator should be greater than 0" + e);
			e.printStackTrace();
		} // Catch block to handle Exception
		catch (Exception e) {
			System.out.println("Exception occurs " + e);
			e.printStackTrace();
		}

	}
}
