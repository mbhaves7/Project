/*Take two numbers from the user and perform the division operation and handle
Arithmetic Exception. O/P- Enter two numbers: 10 0 */

package Demo;

import java.util.Scanner;

public class Q_35_ArithException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");// input 1 number from user
		int a = sc.nextInt();
		System.out.println("Enter Second Number");// input 2 number from user
		int b = sc.nextInt();
		try {// try block of handle for Exception
			int c = a / b;// division for two number
			System.out.println("Division of two number is " + c);
		} catch (ArithmeticException e) {// catch block for error Exception
			System.out.println("denominator should be greater than 0");
		} catch (Exception e) {// catch block for error Exception
			e.setStackTrace(null);
		}

		sc.close();
	}

}
