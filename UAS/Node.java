package UAS;

public class Node {
    Vehicle vehicle;
    TaxTransaction transaction;
    Node prev;
    Node next;

    public Node(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.transaction = null;
        this.prev = null;
        this.next = null;
    }

    public Node(TaxTransaction transaction) {
        this.transaction = transaction;
        this.vehicle = null;
        this.prev = null;
        this.next = null;
    }
}
