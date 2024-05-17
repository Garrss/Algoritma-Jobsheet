package UTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StockManager {
    private static ArrayList<Item> items = new ArrayList<>();

    // StockManager to manage item data and operations.

    public static void main(String[] args) {
        initializeItems();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStock Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Sort Items by Stock (Ascending)");
            System.out.println("4. Display Food Items with No Stock");
            System.out.println("5. Search Item by Name");
            System.out.println("6. Add Stock for Item");
            System.out.println("7. Decrease Stock for Item");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    displayAllItems();
                    break;
                case 3:
                    sortItemsByStock();
                    break;
                case 4:
                    displayFoodItemsWithNoStock();
                    break;
                case 5:
                    searchItemByName(scanner);
                    break;
                case 6:
                    addStock(scanner);
                    break;
                case 7:
                    decreaseStock(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private static void initializeItems() {
        // Add initial items based on given data
        items.add(new Item(16030927, "Indomilk", "drink", 100));
        items.add(new Item(16100617, "Sprite", "drink", 70));
        items.add(new Item(16240401, "Yakult", "drink", 500));
        items.add(new Item(16270525, "Indomie", "food", 250));
        items.add(new Item(16971204, "Oreo", "food", 320));
        items.add(new Item(16100727, "Chocochips", "food", 120));
        items.add(new Item(16460329, "Ballpoint", "stationary", 75));
        items.add(new Item(16320421, "Pencil", "stationary", 110));
        items.add(new Item(16180729, "Book", "stationary", 57));
    }

    private static void addItem(Scanner scanner) {
        System.out.print("Enter Item Code: ");
        int itemCode = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Item Category: ");
        String category = scanner.nextLine();
        System.out.print("Enter Initial Stock: ");
        int stock = scanner.nextInt();

        items.add(new Item(itemCode, name, category, stock));
        System.out.println("Item added successfully!");
    }

    private static void displayAllItems() {
        System.out.println("\nAll Items:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    private static void sortItemsByStock() {
        Collections.sort(items, Comparator.comparingInt(Item::getStock));
        System.out.println("\nItems sorted by stock (ascending):");
        displayAllItems();
    }

    private static void displayFoodItemsWithNoStock() {
        System.out.println("\nFood Items with No Stock:");
        for (Item item : items) {
            if (item.getCategory().equalsIgnoreCase("food") && item.getStock() == 0) {
                System.out.println(item);
            }
        }
    }

    private static void searchItemByName(Scanner scanner) {
        System.out.print("Enter keyword to search by Name: ");
        String keyword = scanner.next();
        boolean found = false;

        System.out.println("\nSearch Results:");
        for (Item item : items) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No items found with the given keyword.");
        }
    }

    private static void addStock(Scanner scanner) {
        System.out.print("Enter Item Code to add stock: ");
        int itemCode = scanner.nextInt();
        System.out.print("Enter quantity to add: ");
        int quantity = scanner.nextInt();

        for (Item item : items) {
            if (item.getItemCode() == itemCode) {
                item.setStock(item.getStock() + quantity);
                System.out.println("Stock added successfully!");
                return;
            }
        }

        System.out.println("Item not found with the given Item Code.");
    }

    private static void decreaseStock(Scanner scanner) {
        System.out.print("Enter Item Code to decrease stock: ");
        int itemCode = scanner.nextInt();
        System.out.print("Enter quantity to decrease: ");
        int quantity = scanner.nextInt();

        for (Item item : items) {
            if (item.getItemCode() == itemCode) {
                if (item.getStock() >= quantity) {
                    item.setStock(item.getStock() - quantity);
                    System.out.println("Stock decreased successfully!");
                } else {
                    System.out.println("Insufficient stock to decrease.");
                }
                return;
            }
        }

        System.out.println("Item not found with the given Item Code.");
    }
}