package Jobsheet12;

public class DoubleLinkedList20 {
    Node20 head;
    int size;

    public DoubleLinkedList20() {
        head = null;
        size = 0;
    }

    public boolean isempty() {
        return head == null;
    }

    public void addfirst(int item) {
        if (isempty()) {
            head = new Node20(null, item, null);
        } else {
            Node20 newNode = new Node20(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addlast(int item) {
        if (isempty()) {
            addfirst(item);
        } else {
            Node20 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node20 newNode = new Node20(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) {
        if (isempty()) {
            addfirst(item);
        } else if (index < 0 || index > size) {
            System.out.println("Index out of bound");
        } else {
            Node20 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                Node20 newNode = new Node20(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node20 newNode = new Node20(current.prev, item, current.next);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isempty()) {
            Node20 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\n Succesfully added");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void removeFirst() {
        if (isempty()) {
            System.out.println("Linked list is still empty, cannot remove");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isempty()) {
            System.out.println("Linked list is still empty, cannot remove");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node20 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) {
        if (isempty() || index >= size) {
            System.out.println("Index value is out of bound");
        } else if (size == 0) {
            removeFirst();
        } else {
            Node20 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst() {
        if (isempty()) {
            System.out.println("Linked list still empty");
        }
        return head.data;
    }

    public int getLast(int index) {
        if (isempty()) {
            System.out.println("Linked list still empty");
        }
        Node20 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) {
        if (isempty()) {
            System.out.println("Linked list still empty");
        }
        Node20 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}