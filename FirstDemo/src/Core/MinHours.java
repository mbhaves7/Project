package Core;

import java.util.Scanner;

public class MinHours {

	//Convert minutes into seconds and hours
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter Minutes");
			int min = sc.nextInt();
			int sec = min*60;
			int hour = min/60;
			System.out.println("Total Seconds \t"+sec+"\n Total Hours "+hour);
			
	}
}
