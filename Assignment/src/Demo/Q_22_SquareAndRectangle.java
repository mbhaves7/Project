/*• Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side
of square. */

package Demo;

import java.util.Scanner;

class Square {
	int s, l, b;

	Square(int s) {// constructor with parameter
		this.s = s;
		System.out.println("Area of square " + s * s);// print Area of square
	}

	Square(int l, int b) {// constructor with parameter
		this.l = l;
		this.b = b;
		System.out.println("Area of Rectangle :" + l * b);// print Area of Rectangle
	}
}

public class Q_22_SquareAndRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Side : ");
		int d = sc.nextInt();
		Square sq = new Square(d);// create constructor
		System.out.print("Enter length : ");
		int l = sc.nextInt();
		System.out.print("Enter breadth : ");
		int b = sc.nextInt();
		Square sq1 = new Square(l, b);// create constructor

	}
}
