/*Write a Java program that reads a positive integer and count the number of digits the
number.
Input an integer number less than ten billion: 125463
Number of digits in the number: 6 
 */

package Demo;

import java.util.Scanner;

public class Q_07_IntegerAndCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter interger value"); // input integer value from user
		int v = sc.nextInt();
		String st = Integer.toString(v);// convert integer to string
		int le = st.length();// length of string
		int x = Math.abs(le);// total digit count
		System.out.println(
				"Input an integer number less than ten billion :" + v + "" + " \nNumber of digits in the number: " + x);
	}
}
