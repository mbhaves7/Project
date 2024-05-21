/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods.
I3. Write a program which will ask the user to enter his/her
marks (out of 100). Define a method that will display grades according to the marks
entered as below:
Marks Grade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
40 Fail  */

package Demo;

import java.util.Scanner;

abstract class Shape {
	abstract double rectangleArea(double length, double breadth);// method for Area of Rectangle

	abstract double squareArea(double side);// method for area of square

	abstract double circleArea(double radius);// method for area of circle
}

class Area extends Shape {

	@Override
	double rectangleArea(double length, double breadth) {// method call
		return length * breadth;
	}

	@Override
	double squareArea(double side) {// method call
		return side * side;
	}

	@Override
	double circleArea(double radius) {// method call
		return Math.PI * radius * radius;
	}

}

public class Q_32_AbstractClassShape {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");// length input from user
		double l = sc.nextDouble();
		System.out.print("Enter breadth : ");// breadth input from user
		double b = sc.nextDouble();
		Area a = new Area();

		System.out.println("Area of Rectangle is " + a.rectangleArea(l, b)); // output show Area of Rectangle

		System.out.print("Enter side : ");// side input from user
		double s = sc.nextDouble();
		System.out.println("Area of Square is " + a.squareArea(s));// output show Area of Square

		System.out.print("Enter radius : ");// radius input from user
		double r = sc.nextDouble();

		System.out.println("Area of Circle is " + a.circleArea(r));// output show Area of Circle

		System.out.println("Enter Mark of student");
		int stu = sc.nextInt();

		if (stu >= 91 && stu <= 100) {
			System.out.println("Student Grade is A");
		} else if (stu >= 71 && stu <= 90) {
			System.out.println("Student Grade is B");
		} else if (stu >= 61 && stu <= 70) {
			System.out.println("Student Grade is C");
		} else if (stu >= 51 && stu <= 60) {
			System.out.println("Student Grade is D");
		} else if (stu >= 41 && stu <= 50) {
			System.out.println("Student Grade is DD ");
		} else if (stu <= 40) {
			System.out.println("Student Grade is Fail");
		} else {
			System.out.println("Error : Enter valid input ");
		}
		sc.close();
	}
}
