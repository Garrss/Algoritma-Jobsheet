public class ReceiptStack {
    int size, top;
    Receipt data[];

    ReceiptStack(int size) {
        this.size = size;
        data = new Receipt[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(Receipt dt) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top] = dt;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Remove data: " + data[top].Id + " | " + data[top].quantity + " | " + data[top].price + " | "
                + data[top].date);
        top--;
    }

    void peek() {
        System.out.println("Top element: " + data[top]);
    }

    void print() {
        System.out.println("Stack contents");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].Id + " | " + data[i].quantity + " | " + data[i].price + " | "
                    + data[i].date);
        }
        System.out.println();
    }

    void clear() {
        top = -1;
    }
}