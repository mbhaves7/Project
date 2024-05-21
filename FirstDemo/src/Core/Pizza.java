package Core;

//import java.util.Iterator;
import java.util.Scanner;

public class Pizza {
	/*
	 * small(150) 4 pizaa and 500ml coke free medium (250) 3 pizaa and 1Lt coke free
	 * large (500) 2 pizaa and 1 Lt coke free and cream monster (700) 5 pizza and
	 * free all
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean addMore = true;

		while (addMore) {
			System.out.println("Enter which type of pizza would you like \n1.small\n2.medium\n3.large\n4.monster");
			int p = sc.nextInt();
			int s = 150, m = 250, l = 500, mo = 700;

			switch (p) {
			case 1:
				System.out.println("Price is " + s + " per pizaa \nPlease tell how many pizza :");
				int i = sc.nextInt();
				if (i >= 4) {

					System.out.println("total price of pizaa \t" + s * i + "and free 500ml coke " + (float) i / 4);
				} else {
					System.out.println("total price of pizaa " + s * i);
				}
				break;
			case 2:
				System.out.println("Price is " + m + " per pizaa \nPlease tell how many pizza :");
				m = 250;
				int i1 = sc.nextInt();
				if (i1 >= 3) {
					System.out.println("total Price of pizaa " + m * i1 + " and free 1 lit coke " + i1 / 3);
				} else {
					System.out.println("total price of pizaa " + m * i1);
				}
				break;
			case 3:
				System.out.println("Price is " + l + " per pizaa \nPlease tell how many pizza :");
				l = 500;
				int i2 = sc.nextInt();
				if (i2 >= 4) {

					System.out.println("total price of pizaa " + l * i2 + "and  free 1 lit coke & ice-cream " + i2 / 2);
				} else {
					System.out.println("total price of pizaa " + l * i2);
				}
				break;
			case 4:
				System.out.println("Price is " + mo + " per pizaa \nPlease tell how many pizza :");
				int i3 = sc.nextInt();
				if (i3 >= 4) {

					System.out.println(
							"total price of pizaa " + mo * i3 + " and free 1.5 lit coke & ice-cream = " + i3 / 5);
				} else {
					System.out.println("total price of pizaa " + mo * i3);
				}
				break;
			default:
				System.out.println("Invalid input Please try again");
			}

			System.out.println("Would you like to place another order? (y/n)");
			  String response = sc.next();
	            if (!response.equalsIgnoreCase("yes")) {
	                addMore = false;
	            }
	            
//	            System.out.println("your total bill ");
//	            int bill = sc.nextInt();
//	            bill = 
			
		}
	}
}
