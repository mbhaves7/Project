package Demo;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element of array");
		int as = sc.nextInt();
		int rev[] = new int[as];
		for (int i = 0; i < rev.length; i++) {
			System.out.print("array [" + i + "] =");
			rev[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < rev.length; i++) {
			for (int j = i + 1; j < rev.length; j++) {
				temp = rev[i];
				rev[i] = rev[j];
				rev[j] = temp;
			}
		}
		for (int i = 0; i < rev.length; i++) {
			System.out.println("Reverse Array[" + i + "] =" + rev[i]);
		}

	}
}
