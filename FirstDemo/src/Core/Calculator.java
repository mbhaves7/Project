package Core;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print(" enter 1st number A \t");
		double a= sc.nextDouble();
		System.out.print("enter 2st number B \t");
		double b = sc.nextDouble();
		
		
		double c = a+b;
		double sub = a-b;
		double d= a*b;
		double e = a/b;
		double g = a%b;
	
		System.out.println("Addition \t"+c);
		System.out.println("Subtraction \t"+a);
		System.out.println("Multiplication \t"+d);
		System.out.println("Division \t" +e);
		System.out.println("Modulo \t \t" +g);
	}
	
	
}

