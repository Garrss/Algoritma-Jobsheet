package Jobsheet12.Assignment4;

public class StudentList {
    private Node head;
    private Node tail;

    public StudentList() {
        this.head = null;
        this.tail = null;
    }

    public void addHead(Student data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addTail(Student data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtIndex(int index, Student data) {
        if (index == 0) {
            addHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addTail(data);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    public void removeHead() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeTail() {
        if (tail == null) {
            return;
        }
        if (tail.prev == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAtIndex(int index) {
        if (head == null) {
            return;
        }
        if (index == 0) {
            removeHead();
            return;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }

        if (temp == null || temp.prev == null) {
            return;
        }

        if (temp.next == null) {
            removeTail();
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            temp.data.print();
            temp = temp.next;
        }
    }

    public Node searchByNim(String nim) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equals(nim)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void sortDescendingByGpa() {
        if (head == null) {
            return;
        }

        boolean swapped;
        Node current;
        Node last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data.gpa < current.next.data.gpa) {
                    Student temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }
}