package Core;

import java.util.Scanner;

public class ConAbbreviate {
//.Convert school’s name in abbreviated form like bhavesh j. maheshwari===> b.j.maheshwari
	public static void main(String[] args) {
		
		Scanner var = new Scanner(System.in);
		System.out.println("ascii value of given number");
		char fir = var.next().charAt(0);
		
		System.out.println("Enter middle Name");
		char mid=var.next().charAt(0);
		
		System.out.println("Enter last Name");
		String las=var.next().toString();
		
		System.out.println("\n \t" +fir+ "."+mid+ "." +las);
		
	
	
	}
}
