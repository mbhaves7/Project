/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members*/
package Demo;

class Member {
	int Members, Age;
	String Name, Address;
	double PhoneNumber, Salary;

	Member(int Members, int Age, String Name, String Address, double PhoneNumber, double Salary) {// create constructor
		this.Members = Members;
		this.Age = Age;
		this.Name = Name;
		this.Address = Address;
		this.PhoneNumber = PhoneNumber;
		this.Salary = Salary;

	}

	void printSalary() {// call method
		System.out.println("Member = " + Members + "\nAge = " + Age + "\nName= " + Name + "\nAddress = " + Address
				+ "\nMobile = " + PhoneNumber + "\nSalary = " + Salary);
	}
}

public class Q_24_ClassMember {

	public static void main(String[] args) {

		Member m = new Member(101, 30, "java", "surat", 123, 60000);
		m.printSalary();// call constructor
	}

}
