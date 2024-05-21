package Core;

import java.util.Scanner;

public class CompoundInterest {
//Calculate compound interest== Principle*(1+(rate / 100))^time – Principle
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount \t");
		double a = sc.nextDouble();
		
		System.out.println("enter rate \t");
		double r= sc.nextDouble();
		System.out.println("enter time");
		double t = sc.nextDouble();
//		System.out.println("number compound interest ");
//		int n = sc.nextInt();
//		
		double interest = a*(Math.pow((1+(r/100)),t))-a;
		System.out.println("annually interest \t"+interest);
		
		
		double ci= interest-a;
		System.out.println("compound interest \t"+ci);
	}
}
