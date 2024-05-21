package Demo;

import java.util.Scanner;

public class Q_10_N_NN_NNN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any thing");
		int n = sc.nextInt();
		int nn = n * 10 + n;
		int nnn = nn * 10 + n;
		int p = n + nn + nnn;
		System.out.println("result " + n + " " + nn + " " + nnn + "" + " is " + p);
		sc.close();
	}
}
