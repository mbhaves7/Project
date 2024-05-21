package Core;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		//area of Triangle Formula : A = 1/2 × b × h
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base \t");
		double b=sc.nextDouble();
		System.out.print("Enter Height \t");
		double h=sc.nextDouble();
		double t=(b*h)/2;
		System.out.println("area of Triangle \t"+t);
		sc.close();
		
	}

}
