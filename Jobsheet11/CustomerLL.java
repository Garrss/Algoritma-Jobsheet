package Jobsheet11;

public class CustomerLL {
    CustomerNode head;
    CustomerNode tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            CustomerNode tmp = head;
            System.out.println("Customer List:");
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        } else {
            System.out.println("The customer list is empty");
        }
    }

    public void addFirst(Customer customer) {
        CustomerNode newNode = new CustomerNode(customer);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Customer customer) {
        CustomerNode newNode = new CustomerNode(customer);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
}