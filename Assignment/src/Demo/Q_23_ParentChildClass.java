/*Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class*/
package Demo;

class parent11 {
	void parentClass1() {// parent method
		System.out.println("This is parent class");
	}
}

class child12 extends parent11 {// inherit parent class
	void childClass1() {// child method
		System.out.println("This is child class");
	}
}

public class Q_23_ParentChildClass {

	public static void main(String[] args) {

		parent11 ob = new parent11();// create constructor
		ob.parentClass1();
		child12 ob1 = new child12();// create constructor
		ob1.childClass1();
		ob1.parentClass1();
	}

}