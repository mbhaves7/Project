package Core;

public class cons {
	public static void main(String[] args) {
		User u1 = new User();
		User u4 = new User(2, "python", 300.0);
		User u5 = new User(u4);
		u5.printData();
		
	}
}

class User {
	int id;
	String name;
	double salary;

	User() {
		System.out.println("default cons");
	}

	User(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void printData() {
		System.out.println("id : " + id + "\nname : " + name + "\nsalary : " + salary);
	}

	User(User u4) {
		this.id = u4.id;
		this.name = u4.name;
		this.salary = u4.salary;
	}
}
