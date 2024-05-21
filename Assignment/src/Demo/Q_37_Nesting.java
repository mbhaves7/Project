/*W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code}*/

package Demo;

import java.util.InputMismatchException;

public class Q_37_Nesting {
	public static void main(String[] args) {

		try {
			try {
				int[] a = new int[5];
				a[5] = 30 / 0; // This line may throw ArithmeticException or ArrayIndexOutOfBoundsException
			} catch (ArithmeticException e) {
				System.out.println(e + " \nError: Division by zero is not allowed");
			}
		} catch (InputMismatchException e) {
			System.out.println(e + "please input valid number ");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println(e + " enter number");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " \nArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Exception occurs " + e);
		}

	}
}
