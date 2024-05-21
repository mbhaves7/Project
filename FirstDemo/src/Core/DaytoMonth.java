package Core;

import java.util.Scanner;

public class DaytoMonth {
//.Convert days into months
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number of days \t");
		
		int d=sc.nextInt();
		float month = d/30f;
		System.out.println("Months \t"+month);
	
	//Convert years into days and months
	
		System.out.print("Enter year \t");
		int year =sc.nextInt();
		int days= 365*year;
		int months = year*12;
		System.out.println("Total Days \t"+days+"\n Total Months\t "+months);
		
			
	}
}
