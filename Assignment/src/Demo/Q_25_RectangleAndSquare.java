/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square. */

package Demo;

import java.util.Scanner;

class Rectangle {
	double length, width;

	Rectangle(double length, double width) {// create constructor
		this.length = length;
		this.width = width;
	}

	void area(double length, double width) {// create method for perimeter of rectangle
		double peri = 2 * (length + width);
		System.out.println("Perimeter of Rectangle = " + peri);
	}

	void rectangle(double length, double width) {// create method for rectangle
		double rectan = length * width;
		System.out.println("Area of Rectangle = " + rectan);// print Area of Rectangle
	}
}

class Square1 extends Rectangle {// create class inherit with parent class
	private static double width;
	private static double length;
	int s;

	Square1(int s) {// create constructor
		super(length, width);
		this.s = s;
		int area = s * s;
		System.out.println("Area of Square = " + area);// print Area of Square
	}

}

public class Q_25_RectangleAndSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		double l = sc.nextDouble();
		System.out.println("Enter Width");
		double w = sc.nextDouble();
		System.out.println("Enter Side");
		int s = sc.nextInt();
		Rectangle re = new Rectangle(l, w);
		re.rectangle(l, w);// call constructor
		re.area(l, w);// call constructor

		Square1 sq = new Square1(s);

		sc.close();
	}
}
