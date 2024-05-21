/*W.A.J.P to find the second most frequent character in a given string. The given string
is: successes The second most frequent char in the string is: cCreate a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for
each data type.  */
package Demo;

public class Q_20_PrintNumber {

	public static void main(String[] args) {
		printn s = new printn(100);

		printn s1 = new printn("bha ");
		printn s2 = new printn("tops", 101);
		System.out.println("Name : " + s2.name + "\tRollno : " + s2.rollno);
		printn s3 = new printn("binod", 102, 3.14);
		System.out.println("Name : " + s3.name + "\tRollno : " + s3.rollno + "\tPI value : " + s3.pi);
		printn s4 = new printn("vinod", 103, 3.14, true);
		System.out.println(
				"Name : " + s4.name + "\tRollno : " + s4.rollno + "\tPI value : " + s4.pi + "\tBoolean value :" + s4.b);
		printn s5 = new printn(+91f);

	}
}

class printn {
	String name;
	int rollno = 26;
	double pi;
	boolean b;
	float mob;

	printn(int rollno) {// one parameter int with method
		this.rollno = rollno;
		System.out.println("Rollno : " + this.rollno);
	}

	printn(String name) { // one parameter string with method
		this.name = name;
		System.out.println("Name : " + this.name);

	}

	printn(String name, int rollno) {// two parameter with method
		this.name = name;
		this.rollno = rollno;

	}

	printn(String name, int rollno, double pi) {// three parameter with method
		this.name = name;
		this.rollno = rollno;
		this.pi = pi;
	}

	printn(String name, int rollno, double pi, boolean b) {// multiple parameter with method
		this.name = name;
		this.rollno = rollno;
		this.pi = pi;
		this.b = b;
	}

	printn(float mob) {
		this.mob = mob;
		System.out.println("Mobile : " + this.mob);

	}
}
