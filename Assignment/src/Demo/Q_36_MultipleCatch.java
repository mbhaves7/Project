/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
exception and another one is to handle
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/

package Demo;

import java.util.InputMismatchException;

public class Q_36_MultipleCatch {
	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			a[5] = a[30] / a[0];
			// System.out.println("Division of two number is " );
		} catch (ArithmeticException e) {
			System.out.println(e + " \nError: Division by zero is not allowed");
			// e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println(e + "please input valid number ");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println(e + " enter number");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " \nArrayIndexOutOfBounds Exception occurs");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occurs " + e);
			e.printStackTrace();
		}

	}
}
