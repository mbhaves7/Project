/*• Write a Java program to print the ASCII value of a given character */
package Demo;

import java.util.Scanner;

public class Q_09_Ascii {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter character value from ascii");//enter character value
		ch = sc.next().charAt(0);
		int i = ch;
		System.out.println("Ascii value of Character " + ch + " is " + i);
		sc.close();
	}
}
