package Demo;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter element of array");
		int e = sc.nextInt();
		int s[] = new int[e];

		for (int index = 0; index < s.length; index++) {
			System.out.print("element[" + index + "] =");
			s[index] = sc.nextInt();
		}

		System.out.println("enter find element of array ");
		int f = sc.nextInt();

		for (int index = 0; index < s.length; index++) {
			if (s[index] == f) {
				System.out.println("element is " + s[index] + " in  position [" + index + "]");
				break;
			} else if (f != s[index]) {
				System.out.println("ple enter right nymber" + f);
				break;
			} else {
				System.out.println("not find posioion ");
			}
		}
	}
}

//for (int index = 0; index < s.length; index++) {
//	if (f == s[index]) {
//		System.out.println("yes");
////		c++;
//	}
//
//if (c > 0) {
//	System.out.println("element is " + s[index] + " in  position [" +  f+ "]");
//
//} else {
//	System.out.println("not find");
//	continue;
//}