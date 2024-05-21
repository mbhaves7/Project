/* Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
message. 
 */
package Demo;

import java.util.Scanner;

public class Q_02_VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the character"); // input character from user
		String c = sc.nextLine();
		if (c.length() != 1) { // if...else ...if..else condition
			System.out.println("Error : please enter single alphabet");
		} else {
			char ch = c.charAt(0);

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				System.out.println(ch + "  is Vowel");
			} else {
				System.out.println(ch + "  is Consonant");
			}
		}
	}
}
