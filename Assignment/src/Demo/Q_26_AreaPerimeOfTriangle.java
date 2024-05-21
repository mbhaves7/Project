/*• Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor.*/
package Demo;

class Triangle {// create class for triangle
	double base = 3;
	double height = 4;

	Triangle() {// create constructor
		double areaOfTriangle = (base * height) / 2;
		System.out.println("Area of Triangle : " + areaOfTriangle);// print Area of Triangle
	}
}

class PerimeOfTriangle {// create class for Perimeter Of Triangle
	double side = 5, base = 3, side1 = 4;

	PerimeOfTriangle() {// create constructor
		double PeriTriangle = (side + base + side1);
		System.out.println("Perimeter Of Triangle : " + PeriTriangle);// print Perimeter Of Triangle
	}

}

public class Q_26_AreaPerimeOfTriangle {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		PerimeOfTriangle peri = new PerimeOfTriangle();

	}
}
