
import java.util.ArrayList;
import java.util.Scanner;

class Stock {
	private String name, company;
	private int pid, quantity;
	private double price;

	public Stock(int pid, String name, double price, int quantity, String company) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

public class inventory {

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Stock> inventory = new ArrayList<>();
	int productIdCounter = 1;

	public static void main(String[] args) {
		inventory system = new inventory();
		while (true) {
			System.out.println("\n***** Inventory Management System *****\n");
			System.out.println("1. Add Stock");
			System.out.println("2. View All Stocks");
			System.out.println("3. search Stock");
			System.out.println("4. Edit Stock");
			System.out.println("5. Delete Stock");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // Consume newline
			switch (choice) {
			case 1:
				system.addStock();
				break;
			case 2:
				system.viewAllStocks();
				break;
			case 3:
				system.searchStock();
			case 4:
				system.editStock();
				break;
			case 5:
				system.deleteStock();
				break;
			case 6:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
			}
		}
	}

	private void addStock() {
		System.out.println("\n***** Add Stock *****");
		System.out.println("\nEnter Product name: ");
		String name = sc.next();
		System.out.print("Enter Product Price:: ");
		double price = sc.nextInt();
		System.out.print("Enter Stock quantity: ");
		int quantity = sc.nextInt();
		System.out.print("Enter Product Company: ");
		String company = sc.next();
		sc.nextLine(); // Consume newline
		inventory.add(new Stock(productIdCounter++, name, price, quantity, company));
		System.out.println("\nStock added successfully!");
	}

	private void viewAllStocks() {
		System.out.println("\n***** View All Stocks *****");
		if (inventory.isEmpty()) {
			System.out.println("Inventory is empty.");
			return;
		}
		System.out.println("ProductID\tName\tPrice\tQuantity\tProduct_Company");
		for (Stock Stock : inventory) {
			System.out.println(Stock.getPid() + "\t\t" + Stock.getName() + "\t" + Stock.getPrice() + "\t"
					+ Stock.getQuantity() + "\t\t\t" + Stock.getCompany());
		}
	}

	private void editStock() {
		System.out.println("**** Edit Stock ****");
		System.out.print("Enter product ID to edit: ");
		int productId = sc.nextInt();
		sc.nextLine(); // Consume newline
		for (Stock product : inventory) {
			if (product.getPid() == productId) {
				System.out.print("Enter new name: ");
				String name = sc.nextLine();
				System.out.print("Enter new price: ");
				double price = sc.nextDouble();
				System.out.print("Enter new quantity: ");
				int quantity = sc.nextInt();
				sc.nextLine(); // Consume newline
				System.out.print("Enter new company: ");
				String company = sc.nextLine();
				product.setName(name);
				product.setPrice(price);
				product.setQuantity(quantity);
				product.setCompany(company);
				System.out.println("Product updated successfully!");
				return;
			}
		}
		System.out.println("Product not found with ID " + productId);
	}

	private void searchStock() {
		System.out.println("**** Search Stock *****");
		System.out.print("Enter Stock name to search: ");
		String name = sc.nextLine();
		boolean found = false;
		for (Stock Stock : inventory) {
			if (Stock.getName().equalsIgnoreCase(name)) {
				found = true;
				System.out.println("Item name - " + Stock.getName());// + ", Quantity: " + Stock.getQuantity());
				System.out.println("Item price - " + Stock.getName());
				System.out.println("Item Quantity - " + Stock.getName());
				System.out.println("Item found - " + Stock.getName());
				System.out.println("Item found - " + Stock.getName());

				break;
			}
		}
		if (!found) {
			System.out.println("Stock not found in stock.");
		}
	}

	private void deleteStock() {
		System.out.println("***** Delete Stock ****");
		System.out.print("Enter product ID to delete: ");
		int productId = sc.nextInt();
		sc.nextLine(); // Consume newline
		for (Stock product : inventory) {
			if (product.getPid() == productId) {
				inventory.remove(product);
				System.out.println("Product deleted successfully!");
				return;
			}
		}
		System.out.println("Product not found with ID " + productId);
	}
}
