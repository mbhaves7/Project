package Core;

import java.util.Scanner;

public class AppleStudent {
	//Accept number of students from user. I need to give 5 apples to each
	//student. How many apples are required?

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Student \t");
		int Student=sc.nextInt();
		int Apple=5;
		int Req = Student * Apple;
		
		System.out.println("Apple are required \t"+Req); 
		
	}
	
}
