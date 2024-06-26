package Jobsheet11;

public class CustomerQueue {
    CustomerLL list;

    public CustomerQueue() {
        list = new CustomerLL();
    }

    public void enqueue(Customer customer) {
        list.addLast(customer);
    }

    public Customer dequeue() {
        if (list.isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        } else {
            CustomerNode frontNode = list.head;
            if (list.head == list.tail) {
                list.head = list.tail = null;
            } else {
                list.head = list.head.next;
            }
            return frontNode.data;
        }
    }

    public void printQueue() {
        list.print();
    }
}