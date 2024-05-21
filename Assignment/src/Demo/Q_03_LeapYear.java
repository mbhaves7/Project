/*Write a Java program that takes a year from user and print whether that year is a leap
year or not. B19. Write a program in Java to display the first 10 natural numbers
using while loop*/
package Demo;

import java.util.Scanner;

public class Q_03_LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : "); // input year from user
		int y = sc.nextInt();
		if ((y % 4 == 0)) { // if...else condition for leap year
			System.out.println(y + " is a leap year.");
		} else {
			System.out.println(y + " is not a leap year.");
		}

		System.out.println("first 10 natural numbers ");
		int n = 1;// total first 10 natural number
		while (n <= 10) {
			System.out.println(n);
			n++;
		}
	}
}
