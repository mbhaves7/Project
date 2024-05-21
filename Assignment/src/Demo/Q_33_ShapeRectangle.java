
package Demo;

class ShapePrint {

	public void displayShape() {
		System.out.println("This is a shape");
	}
}

class PrintRectangle extends ShapePrint {
	public void PRectangle() {
	
		System.out.println("This is rectangular shape");
	}

}

class Circle extends ShapePrint {

	public void CircleShape() {
		System.out.println("This is circular shape");
	}

}

class Squar extends PrintRectangle {

	public void SquarShape() {
		System.out.println("Square is a rectangle");
	}
}

public class Q_33_ShapeRectangle {

	public static void main(String[] args) {
		Squar sq= new Squar();
		sq.displayShape();
		sq.PRectangle();
	}

}
