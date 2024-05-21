package Core;

import java.util.Scanner;

public class SwapMulDiv {
	//WAP to calculate swap 2 numbers with using of multiplication and division
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number \t");
		int a=sc.nextInt();
		System.out.println("enter 2nd number \t");
		int b=sc.nextInt();
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swap without third variable \t"+a+","+b);
		
	}
}
