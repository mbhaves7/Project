package Core;

import java.util.Scanner;

public class Size {


	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("enter 1st number A \t");
		int a= sc.nextInt();
		System.out.print("enter 2st number B \t");
		int b = sc.nextInt();
		
		
		int c = a+b;
		String s = String.valueOf(c);
	
	
		System.out.println("Addition \t"+c+"\n size \t"+s.length());
	}
}
