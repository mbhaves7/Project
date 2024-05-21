/*Write a program in Java to input 5 numbers from keyboard and find their sum and
average using for loop */
package Demo;

import java.util.Scanner;

public class Q_04_SumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, n = 5;
		
		System.out.println("Enter 5 Number"); // input number from user
		for (int i = 1; i <= n; i++) { // sum for 5 input number using for... loop
			System.out.println("enter number " + i);
			int a = sc.nextInt();
			sum = sum + a;// addition formula
		}
		System.out.println("sum of number" + sum);
		double avg = (double) sum / n; // average formula
		System.out.println("average of number :" + avg);
	}
}
