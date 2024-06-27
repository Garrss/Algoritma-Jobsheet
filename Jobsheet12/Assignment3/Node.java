package Jobsheet12.Assignment3;

public class Node {
    int queueNumber;
    String name;
    Node next;
    Node prev;

    public Node(int queueNumber, String name) {
        this.queueNumber = queueNumber;
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}