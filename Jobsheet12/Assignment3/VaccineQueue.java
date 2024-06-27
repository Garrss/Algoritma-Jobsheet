package Jobsheet12.Assignment3;

public class VaccineQueue {
    private Node head;
    private Node tail;
    private int queueCount;

    public VaccineQueue() {
        this.head = null;
        this.tail = null;
        this.queueCount = 0;
    }

    public void addQueue(int queueNumber, String name) {
        Node newNode = new Node(queueNumber, name);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        queueCount++;
    }

    public String removeQueue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return null;
        }
        String name = head.name;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        queueCount--;
        return name;
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = head;
        System.out.println("Current vaccine queue:");
        System.out.println("| No \t| Name \t|");
        while (temp != null) {
            System.out.println("| " + temp.queueNumber + " \t| " + temp.name + " \t|");
            temp = temp.next;
        }
        System.out.println("Queue left: " + queueCount);
    }
}