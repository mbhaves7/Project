package IMS;

import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


public class inventory {

	 private static Scanner scanner = new Scanner(System.in);
	    private static ArrayList<Item> inventory = new ArrayList<>();

	    public static void main(String[] args) {
	    	inventory system = new inventory();
	        while (true) {
	            System.out.println("\n===== Inventory Management System =====\n");
	            System.out.println("1. Add Item");
	            System.out.println("2. View All Items");
	            System.out.println("3. Update Item");
	            System.out.println("4. Delete Item");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            switch (choice) {
	                case 1:
	                    system.addItem();
	                    break;
	                case 2:
	                    system.viewAllItems();
	                    break;
	                case 3:
	                    system.updateItem();
	                    break;
	                case 4:
	                    system.deleteItem();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }
	        }
	    }

	    private void addItem() {
	        System.out.println("\n===== Add Item =====");
	        System.out.print("Enter item name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter item quantity: ");
	        int quantity = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        inventory.add(new Item(name, quantity));
	        System.out.println("Item added successfully!");
	    }

	    private void viewAllItems() {
	        System.out.println("\n===== View All Items =====");
	        if (inventory.isEmpty()) {
	            System.out.println("Inventory is empty.");
	            return;
	        }
	        System.out.println("Name\tQuantity");
	        for (Item item : inventory) {
	            System.out.println(item.getName() + "\t" + item.getQuantity());
	        }
	    }

	    private void updateItem() {
	        System.out.println("\n===== Update Item =====");
	        if (inventory.isEmpty()) {
	            System.out.println("Inventory is empty.");
	            return;
	        }
	        viewAllItems();
	        System.out.print("Enter index of item to update: ");
	        int index = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        if (index < 1 || index >= inventory.size()) {
	            System.out.println("Invalid index.");
	            return;
	        }
	        System.out.print("Enter new quantity: ");
	        int quantity = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        inventory.get(index).setQuantity(quantity);
	        System.out.println("Item updated successfully!");
	    }

	    private void deleteItem() {
	        System.out.println("\n===== Delete Item =====");
	        if (inventory.isEmpty()) {
	            System.out.println("Inventory is empty.");
	            return;
	        }
	        viewAllItems();
	        System.out.print("Enter index of item to delete: ");
	        int index = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        if (index < 0 || index >= inventory.size()) {
	            System.out.println("Invalid index.");
	            return;
	        }
	        inventory.remove(index);
	        System.out.println("Item deleted successfully!");
	    }
}
