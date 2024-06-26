package Jobsheet11;

public class Stack {
    public static Node03 head = null;

    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(String data) {
        Node03 newNode = Node03.createNode(data);
        newNode.next = head;
        head = newNode;
    }

    public static String pop() {
        if (isEmpty()) {
            System.out.println("Pop from empty stack");
            ;
        }
        Node03 poppedNode = head;
        head = head.next;
        return poppedNode.data;
    }

    public static String peek() {
        if (isEmpty()) {
            System.out.println("Peek from empty stack");
        }
        return head.data;
    }

    public static void display() {
        Node03 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }
}