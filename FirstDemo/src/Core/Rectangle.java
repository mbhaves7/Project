package Core;

import java.util.Scanner;

public class Rectangle {
	
	public static void main(String[] args) {
		//area of Rectangle Formula : A=wl

		Scanner sc = new Scanner(System.in);
		System.out.println("enter Width \t");
		int w =sc.nextInt();
		System.out.println("enter Length \t");
		int l =sc.nextInt();
		int a = w*l;
		System.out.println("area of Rectangle \t"+a);
		

	}

}
