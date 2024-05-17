package Coba;

public class MainStockManager {
    public static void main(String[] args) {
        StockManagerclass stockManager = new StockManagerclass();

        // Example usage of stock management functionalities
        stockManager.displayAllItems();
        System.out.println();

        stockManager.sortItemsByStock();
        stockManager.displayAllItems();
        System.out.println();

        stockManager.displayFoodItemsWithNoStock();
        System.out.println();

        stockManager.searchItemByName("Indo");
        System.out.println();

        stockManager.addStock(16030927, 50);
        stockManager.displayAllItems();
        System.out.println();

        stockManager.decreaseStock(16240401, 200);
        stockManager.displayAllItems();
    }
}
