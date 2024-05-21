/*W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid */
package Demo;

import java.util.Scanner;

class AgeValidate {
	int age;

	public void validate(int age) {// Method with integer parameter
		if (age < 18) {// check age is < 18 to vote or not
			throw new ArithmeticException("Not eligible to vote");
		}
	}

}

public class Q_39_ValidateArithCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");

		int a = sc.nextInt();

		AgeValidate age = new AgeValidate();
		try {
			age.validate(a);
			System.out.println(" eligible to vote");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}
}
