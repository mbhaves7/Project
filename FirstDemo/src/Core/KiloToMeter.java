package Core;

import java.util.Scanner;

public class KiloToMeter {
//Convert kilometers into meters
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Kilometer \t");
		int kilo = sc.nextInt();
		int meter =kilo*1000;
		System.out.println("meters \t"+meter);
		
	}
}
