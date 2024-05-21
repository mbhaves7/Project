package Core;

import java.util.Scanner;

public class FtoC {
//Celsius = ((Fahrenheit-32)*5)/9;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Fahrenheit value");
		double f= sc.nextDouble();
		
		double c= ((f-32)*5)/9;
		System.out.println("convert fahrenheit to celsius \t"+c);
	}
	
}
