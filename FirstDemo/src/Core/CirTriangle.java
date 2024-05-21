package Core;

import java.util.Scanner;

public class CirTriangle {
	
	//circumference of Triangle formula : triangle = a + b + c
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A \t");
		int a= sc.nextInt();
		System.out.println("Enter B \t");
		int b = sc.nextInt();
		System.out.println("Enter C \t");
		int c = sc.nextInt();
		
		int tri = a+b+c;
		System.out.println("circumference of Triangle \t"+tri);
	}

}
