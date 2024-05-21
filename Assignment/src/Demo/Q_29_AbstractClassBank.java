/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classes. 
 */

package Demo;

abstract class Bank {// parent class is Bank
	abstract public void getBalance();// method with abstract
}

class BankA extends Bank { // child class is BankA extends with parent
	private int b = 100;

	public void getBalance() {// method call in child class
		System.out.println("Balance in Bank A: $" + b);// deposit in BankA
	}
}

class BankB extends Bank {// child class is BankB extends with parent
	private int b = 150;

	public void getBalance() {// method call in child class
		System.out.println("Balance in Bank A: $" + b);// deposit in BankB
	}
}

class BankC extends Bank {// child class is BankB extends with parent
	private int b = 200;

	public void getBalance() {// method call in child class
		System.out.println("Balance in Bank A: $" + b);// deposit in BankC
	}
}

public class Q_29_AbstractClassBank {
	public static void main(String[] args) {

		BankA a = new BankA();
		a.getBalance();// call child class BankA
		BankB b = new BankB();
		b.getBalance();// call child class BankB
		BankC c = new BankC();
		c.getBalance();// call child class BankC

	}

}
