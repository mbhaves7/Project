/* Write a Java program to count the letters, spaces, numbers and
  other characters of an input string
 */

package Demo;

import java.util.Scanner;

public class Q_08_CountString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		int num = 0, lette = 0, space = 0, other = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				num++;
			} else if (Character.isLetter(ch)) {
				lette++;
			} else if (Character.isWhitespace(ch)) {
				space++;
			} else {
				other++;
			}
		}

		System.out.println("Total Number is " + num);
		System.out.println("Total Letter is " + lette);
		System.out.println("Total Space is " + space);
		System.out.println("Other charater is " + other);

		sc.close();
	}

}
