package Jobsheet11;

public class CustomerNode {
    Customer data;
    CustomerNode next;

    public CustomerNode(Customer data) {
        this.data = data;
        this.next = null;
    }
}