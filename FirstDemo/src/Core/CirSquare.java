package Core;

import java.util.Scanner;

public class CirSquare {

	// circumference of square formula : C = 4 * a
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Area ");
		int a = sc.nextInt();
		int s = 4*a;
		System.out.println(" circumference of square "+s);
	}
}
