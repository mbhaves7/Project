import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private int id;
	private String name, address, city;

	private int age;
	private long contact;

	public Student(int id, String name, int age, long contact, String address, String city) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

public class StudentManagementSystem {

	static Scanner sc = new Scanner(System.in);
	ArrayList<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		StudentManagementSystem SMS = new StudentManagementSystem();
		while (true) {
			System.out.println("***** Student Management System *****");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.println("\nEnter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // Consume newline
			switch (choice) {
			case 1:
				SMS.addStudent();
				break;
			case 2:
				SMS.viewAllStudents();
				break;
			case 3:
				SMS.updateStudent();
				break;
			case 4:
				SMS.deleteStudent();
				break;
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
			}
		}
	}

	private void addStudent() {
		System.out.println("\n***** Add Student *****");
		System.out.println("Enter student ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name: ");
		String name = sc.nextLine();
		System.out.println("Enter student age: ");
		int age = sc.nextInt();
		System.out.println("Enter student contact: ");
		long contact = sc.nextLong();
		System.out.println("Enter student Address: ");
		String address = sc.next();
		sc.nextLine();
		System.out.println("Enter student City: ");
		String city = sc.nextLine();
		students.add(new Student(id, name, age, contact, address, city));
		System.out.println("Student added successfully!");
	}

	private void viewAllStudents() {
		System.out.println("\n***** View All Students ***** ");
		if (students.isEmpty()) {
			System.out.println("No students found.");
			return;
		}
		System.out.println("ID\tName\tAge\tContact\tAddress\tCity");
		for (Student student : students) {
			System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t"
					+ student.getContact() + "\t" + student.getAddress() + "\t" + student.getCity());
		}
	}

	private void updateStudent() {
		System.out.println("\n***** Update Student *****");
		if (students.isEmpty()) {
			System.out.println("\nNo students found.");
			return;
		}
		viewAllStudents();
		System.out.println("\nEnter student ID to update: ");
		int id = sc.nextInt();
		boolean found = false;
		for (Student student : students) {
			if (student.getId() == id) {
				found = true;
				System.out.print("Enter new name: ");
				String name = sc.next();
//				sc.nextLine();

				System.out.print("Enter new age: ");
				int age = sc.nextInt();

				System.out.println("Enter student contact: ");
				long contact = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter student Address: ");
				String address = sc.next();
				System.out.println("Enter student City: ");
				String city = sc.next();
				student.setName(name);
				student.setAge(age);
				student.setContact(contact);
				student.setAddress(address);
				student.setCity(city);
				System.out.println("Student data updated successfully!");
				break;
			}
		}
		if (!found) {
			System.out.println("Student not found with ID " + id);
		}
	}

	private void deleteStudent() {
		System.out.println("\n***** Delete Student *****");
		if (students.isEmpty()) {
			System.out.println("No students found.");
			return;
		}
		viewAllStudents();
		System.out.println("\nEnter student id to delete: ");
		int id = sc.nextInt();
		boolean found = false;
		for (Student student : students) {
			if (student.getId() == id) {
				found = true;
				students.remove(student);
				System.out.println("Student data deleted successfully!");
				break;
			}
		}
		if (!found) {
			System.out.println("Student not found with ID " + id);
		}
	}

}
