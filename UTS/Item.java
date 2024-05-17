package UTS;

//Item class to represent each item
public class Item {
    private int itemCode;
    private String name;
    private String category;
    private int stock;

    public Item(int itemCode, String name, String category, int stock) {
        this.itemCode = itemCode;
        this.name = name;
        this.category = category;
        this.stock = stock;
    }

    public int getItemCode() {
        return itemCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Item{" +
                "itemCode=" + itemCode +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }
}