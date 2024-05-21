package Core;

import java.util.Scanner;

public class RemainingSalary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Total salary");
	double sal = sc.nextDouble();
	// deduct 10% insurance premium
	double deduct = 0.10* sal;
	System.out.println("Deduct 10% insurance premium \t"+deduct);
	
	//10% loan installment
	double  loan =0.10*sal;
	System.out.println("10% loan installment \t"+loan);
	
	// remaining salary
	double remain = sal-deduct-loan;
	
	System.out.println(" remaining salary \t"+remain);

	
	
}
}
