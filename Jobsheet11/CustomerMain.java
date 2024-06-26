package Jobsheet11;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerQueue queue = new CustomerQueue();

        queue.enqueue(new Customer("Alice", "123 Main St", "A1001"));
        queue.enqueue(new Customer("Bob", "456 Elm St", "B2002"));
        queue.enqueue(new Customer("Charlie", "789 Oak St", "C3003"));

        // Printing the queue
        System.out.println("Queue after enqueueing customers:");
        queue.printQueue();

        // Dequeueing customers
        System.out.println("\nDequeueing: " + queue.dequeue());
        System.out.println("Dequeueing: " + queue.dequeue());

        // Printing the queue again
        System.out.println("\nQueue after dequeueing customers:");
        queue.printQueue();
    }
}