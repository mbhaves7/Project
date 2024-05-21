/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
and by both */

package Demo;

import java.util.Scanner;

public class Q_12_DivisibleBy3or5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Divisible by 5 are ");

		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("Enter number for Divisible by 3 are ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("Enter number for Divisible by 3 and 5 are ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " ");
			}
		}
		sc.close();
	}
}
