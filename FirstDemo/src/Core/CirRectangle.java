package Core;

import java.util.Scanner;

public class CirRectangle {
	// circumference of Rectangle formula : C = 4 * a
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter area \t");
		int a= sc.nextInt();
		int C= 4*a;
		System.out.println(" circumference of Rectangle  :"+C);
				
	}

}
