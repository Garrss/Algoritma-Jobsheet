package UAS;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Vehicle vehicle) {
        Node newNode = new Node(vehicle);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Vehicle find(String regNumber) {
        Node current = head;
        while (current != null) {
            if (current.vehicle.getRegNumber().equals(regNumber)) {
                return current.vehicle;
            }
            current = current.next;
        }
        return null;
    }

    public void printList() {
        Node current = head;
        System.out.println("Vehicle List");
        System.out.println("-------------------------------------------------");
        System.out.println("Reg Number | Owner Name | Type | CC | Year | Month to Pay");
        while (current != null) {
            Vehicle vehicle = current.vehicle;
            System.out.printf("%s | %s | %s | %d | %d | %d%n",
                    vehicle.getRegNumber(),
                    vehicle.getName(),
                    vehicle.getType(),
                    vehicle.getCc(),
                    vehicle.getYear(),
                    vehicle.getMonthToPay());
            current = current.next;
        }
        System.out.println("-------------------------------------------------");
    }
}
