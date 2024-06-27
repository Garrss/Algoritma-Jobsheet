package Jobsheet12.Assignment2;

public class BookStack {
    private BookNode top;

    public BookStack() {
        this.top = null;
    }

    public void push(String title) {
        BookNode newNode = new BookNode(title);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top.prev = newNode;
            top = newNode;
        }
    }

    public String pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        String title = top.title;
        top = top.next;
        if (top != null) {
            top.prev = null;
        }
        return title;
    }

    public String peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.title;
    }

    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        BookNode temp = top;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.next;
        }
    }
}