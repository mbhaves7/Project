/*W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes. */
package Demo;

import java.util.Scanner;

//@SuppressWarnings("serial")
class AgeException extends Exception {
	public AgeException(String msg) {
		super(msg);
	}
}

//@SuppressWarnings("serial")
class NameException extends Exception {
	public NameException(String name) {
		super(name);
	}
}

class Student {
	int roll_no, age;
	String name, course;

	Student(int roll_no, int age, String name, String course) {
		this.roll_no = roll_no;
		this.age = age;
		this.name = name;
		this.course = course;
	}

	void Students() throws AgeException, NameException {

		if (age > 15 && age < 21) {
			throw new AgeException("Age is Not Within Range");
		}
		if (name == null || !name.matches("[a-zA-Z ]+")) {
			throw new NameException("Name is Not Valid ");
		}
	}
}

public class Q_41_ConstructorException {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll no");
		int roll = sc.nextInt();
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter course");
		String co = sc.next();
		Student st = new Student(roll, age, name, co);
		try {
			st.Students();
		} catch (AgeException e) {
			e.printStackTrace();
		}
		catch (NameException e) {
			e.printStackTrace();
		}

	}
}
