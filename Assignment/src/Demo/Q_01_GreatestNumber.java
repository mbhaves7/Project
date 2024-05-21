/*Write a Java program to Take three numbers from the user and print the greatest
number. */

package Demo;

import java.util.Scanner;

public class Q_01_GreatestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number :");// input 1 number from user
		int a = sc.nextInt();
		System.out.print("Enter Second Number :");// input 2 number from user
		int b = sc.nextInt();
		System.out.print("Enter Third Number :"); // input 3 number from user
		int c = sc.nextInt();

		if (a > c) { // if...else if...else condition
			System.out.println(a + " is Greatest Number");
		} else if (b > c) {
			System.out.println(b + " is Greatest Number");
		} else {
			System.out.println(c + " is Greatest Number");
		}

	}
}
