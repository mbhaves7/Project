/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
having a method with the same name 'message' that prints "This is first subclass"
and "This is second subclass" respectively. Call the methods 'message' by creating
an object for each subclass.*/

package Demo;

abstract class Parent {// parent class
	abstract public void message();// message method
}

class child1 extends Parent {// child 1 class with extends parent class
	public void message() {// apply method form parent
		System.out.println("This is first subclass");// print massage
	}
}

class child2 extends Parent {// child 1 class with extends parent class
	public void message() {// apply method form parent
		System.out.println("This is second subclass");// print massage
	}
}

public class Q_28_AbstractClassParent {

	public static void main(String[] args) {
		child1 ch = new child1();
		ch.message();// call child 1 class
		child2 ch1 = new child2();
		ch1.message();// call child 2 class
	}
}
