package Core;

import java.util.Scanner;

public class AreaPrism {

	//area of a rectangular prism  formula : A=2(wl+hl+hw)
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Width \t");
	int w =sc.nextInt();
	System.out.println("enter Length \t");
	int l =sc.nextInt();
	System.out.println("enter Height \t");
	int h =sc.nextInt();
	
	int a= 2*(w*l+h*l+h*w);
	System.out.println("area of a rectangular prism \t"+a);
	
}
}
