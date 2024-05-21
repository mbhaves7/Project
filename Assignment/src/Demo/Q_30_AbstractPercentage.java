/*We have to calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
other classes 'A' and 'B' each having a method with the same name which returns the
percentage of the students. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its parameters for student
B. Create an object for each of the two classes and print the percentage of marks for
both the students. */

package Demo;

abstract class Marks {// parent class for marks
	abstract void getPercentage();// method for percentage
}

class studentA extends Marks {// child class for studentA inherit with parent
	int English, Science, Maths;// subject

	studentA(int English, int Science, int Maths) {// constructor for studentA
		this.English = English;
		this.Science = Science;
		this.Maths = Maths;
	}

	void getPercentage() {// method for studentA to get percentage
		double percent = (English + Science + Maths) / 3.0f;// formula to find percentage
		System.out.println(" persent of student A " + percent);// print percentage
	}
}

class studentB extends Marks {// child class for studentB inherit with parent
	int English, Science, Maths, Hindi;// subject

	studentB(int English, int Science, int Maths, int Hindi) {// constructor for studentB
		this.English = English;
		this.Science = Science;
		this.Maths = Maths;
		this.Hindi = Hindi;
	}

	void getPercentage() {// method for studentA to get percentage
		double percent = (English + Science + Maths + Hindi) / 4.0;// formula to find percentage
		System.out.println(" persent of student A " + percent);// print percentage
	}
}

public class Q_30_AbstractPercentage {
	public static void main(String[] args) {
		studentA a = new studentA(60, 55, 97);
		a.getPercentage();// call method for get percentage from studentA
		studentB b = new studentB(87, 76, 99, 93);
		b.getPercentage();// call method for get percentage from studentB
	}
}
