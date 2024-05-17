package Coba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StockManagerclass {
    private List<Item> items;

    public StockManagerclass() {
        this.items = new ArrayList<>();
        initializeItems(); // Initialize with predefined data
    }

    private void initializeItems() {
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

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayAllItems() {
        System.out.println("All Items:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void sortItemsByStock() {
        Collections.sort(items, Comparator.comparingInt(Item::getStock));
    }

    public void displayFoodItemsWithNoStock() {
        System.out.println("Food Items with No Stock:");
        for (Item item : items) {
            if (item.getCategory().equalsIgnoreCase("food") && item.getStock() == 0) {
                System.out.println(item);
            }
        }
    }

    public void searchItemByName(String keyword) {
        System.out.println("Search Results for '" + keyword + "':");
        boolean found = false;
        for (Item item : items) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found with the given name.");
        }
    }

    public void addStock(int itemCode, int quantity) {
        for (Item item : items) {
            if (item.getItemCode() == itemCode) {
                item.setStock(item.getStock() + quantity);
                System.out.println("Stock added successfully.");
                return;
            }
        }
        System.out.println("Item not found with the given item code.");
    }

    public void decreaseStock(int itemCode, int quantity) {
        for (Item item : items) {
            if (item.getItemCode() == itemCode) {
                if (item.getStock() >= quantity) {
                    item.setStock(item.getStock() - quantity);
                    System.out.println("Stock decreased successfully.");
                } else {
                    System.out.println("Insufficient stock to decrease.");
                }
                return;
            }
        }
        System.out.println("Item not found with the given item code.");
    }
}
