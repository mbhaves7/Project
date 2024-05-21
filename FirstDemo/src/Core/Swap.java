package Core;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number \t");
		int a=sc.nextInt();
		System.out.println("enter 2nd number \t");
		int b=sc.nextInt();
		
		int c =a;
		a=b;
		b=c;
		
		System.out.println("after swap using third variable \t"+a+","+b);
		
///////////////////   USING WITHOUT THIRD VARIABLE  //////////////////////////////////////////////////////		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap without third variable \t"+a+","+b);
		
	}
	
}
