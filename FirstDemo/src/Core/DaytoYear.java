package Core;

import java.util.Scanner;

public class DaytoYear {

	//WAP to convert years into days and days into yearsS
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Days \t");
		int d=sc.nextInt();
		float y=d/365f;
		System.out.println("Total Years \t"+y);
		
		System.out.println("Enter year \t");
		int day = sc.nextInt();
		int year = day*365;
		System.out.println("Total Days \t"+year);
		
	}
}
