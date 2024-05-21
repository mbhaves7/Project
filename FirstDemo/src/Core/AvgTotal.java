package Core;

import java.util.Scanner;

public class AvgTotal {
//4.Accept 5 employees name and salary and count average and total salary
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st name \t");
		String n1=sc.next().toString();
		System.out.println("enter salary \t");
		int s1 =sc.nextInt();
		
		System.out.println("enter 2nd name \t");
		String n2=sc.next().toString();

		System.out.println("enter salary \t");
		int s2 =sc.nextInt();
		
		System.out.println("enter 3rd name \t");
		String n3=sc.next().toString();
		System.out.println("enter salary \t");
		int s3 =sc.nextInt();
		
		System.out.println("enter 4th name \t");
		String n14=sc.next().toString();
		
		System.out.println("enter salary \t");
		int s4 =sc.nextInt();
		
		System.out.println("enter 5th name \t");
		String n5=sc.next().toString();
		
		System.out.println("enter salary \t");
		int s5 =sc.nextInt();

		int avg = (s1+s2+s3+s4+s5)/5;
		System.out.println("total average of salary \t"+avg);
		
		int sum = s1+s2+s3+s4+s5;

		System.out.println("total  salary \t"+sum);
		
		sc.close();
	}
}
