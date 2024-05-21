package Core;

import java.util.Scanner;

public class AnnualSalary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Salary");
		double basic = sc.nextDouble();
		double hra = 0.10*basic;
		double da =0.08*hra;
		double gross = basic + hra+da;
		double tax = 0.05*gross;
		double total =gross - tax;
		double annual = 12* total;
		System.out.println("Basic Salary \t\t"+basic);
		System.out.println("House Rent Allowance \t"+hra);
		System.out.println("Dearness Allowance\t"+da);
		System.out.println("Gross Salary \t\t"+gross);
		System.out.println("Tax Deduction \t\t"+tax);
		System.out.println("Total Salary \t\t"+total);
		System.out.println("Annual Employee Salary \t"+annual);
	}
}
