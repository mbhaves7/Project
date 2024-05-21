/*Write a program to print the factorial of a number by defining a method named
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0
 */

package Demo;

import java.util.Scanner;

public class Q_31_Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int x = sc.nextInt();
		int f = factorial(x);
		System.out.println("Factorial " + x + "! number is " + f);
		sc.close();
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
