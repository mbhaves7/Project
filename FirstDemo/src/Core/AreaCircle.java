package Core;

import java.util.Scanner;

public class AreaCircle {
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter redius \t");
		 double r = sc.nextDouble();
		 double A = Math.PI*r*r;
		 System.out.println("Area of circle \t"+A);
		 
		 
		 double d = 2*Math.PI*(r);
		 System.out.println("Circumference of circle \t"+d);
				
	}

}
//System.out.println("Enter redius \t");
