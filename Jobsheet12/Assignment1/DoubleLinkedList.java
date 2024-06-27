package Jobsheet12.Assignment1;

public class DoubleLinkedList {
    private Node1 head;

    public DoubleLinkedList() {
        this.head = null;
    }

    public void addFirst(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addTail(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
        } else {
            Node1 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void addNth(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node1 newNode = new Node1(data);
        Node1 temp = head;
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

    public void removeFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node1 temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void removeNth(int index) {
        if (head == null) {
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node1 temp = head;
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
            temp.prev.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void printList() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int searchData(int data) {
        Node1 temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == data) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void sortDescending() {
        if (head == null) {
            return;
        }
        boolean swapped;
        Node1 current;
        Node1 last = null;
        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data < current.next.data) {
                    int temp = current.data;
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