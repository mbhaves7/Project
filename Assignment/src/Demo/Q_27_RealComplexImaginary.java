/* Print the sum, difference and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by user. 
 */

package Demo;

import java.util.Scanner;

class Complex {// Create constructor
	double real1, real2, Imaginary1, Imaginary2; // data type

	Complex(double real1, double real2, double Imaginary1, double Imaginary2) { // constructor
		this.real1 = real1;
		this.real2 = real2;
		this.Imaginary1 = Imaginary1;
		this.Imaginary2 = Imaginary2;
	}

	void addReal() { // Method Name of addition
		double total = real1 + real2; // addition of real
		System.out.println("total real number add : " + total);
		double add = Imaginary1 + Imaginary2;// addition of Imaginary
		System.out.println("total Imaginary number add : " + add);
	}

	void subReal() { // Method Name of subtraction
		double total = real2 - real1;// subtraction of real
		System.out.println("real number sub : " + total);
		double add = Imaginary2 - Imaginary1; // subtraction of Imaginary
		System.out.println(" Imaginary number sub : " + add);
	}

	void mulReal() {// Method Name of multiplication
		double total = real1 * real2; // multiplication of real
		System.out.println("real number sub : " + total);
		double add = Imaginary1 * Imaginary2; // multiplication of Imaginary
		System.out.println(" Imaginary number sub : " + add);
	}
}

public class Q_27_RealComplexImaginary { // Main class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Real Number"); // input 1 real number from user
		double r1 = sc.nextDouble();
		System.out.println("Enter 1st Imaginary Number"); // input 1 Imaginary number from user
		double i1 = sc.nextDouble();
		System.out.println("Enter 2nd Real Number"); // input 2 real number from user
		double r2 = sc.nextDouble();
		System.out.println("Enter 2nd Imaginary Number"); // input 1 Imaginary number from user
		double i2 = sc.nextDouble();

		Complex co = new Complex(r1, r2, i1, i2); // make constructor
		co.addReal();
		co.subReal();
		co.mulReal();
		sc.close();
	}
}
