package Jobsheet10.Assigment;

public class Queue {
    private int max;
    private int front;
    private int rear;
    private int size;
    private Student[] stdQueue;

    public Queue(int max) {
        this.max = max;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.stdQueue = new Student[max];
    }

    public void create() {
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.stdQueue = new Student[max];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Student student) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % max;
        stdQueue[rear] = student;
        size++;
    }

    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        Student temp = stdQueue[front];
        front = (front + 1) % max;
        size--;
        return temp;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.println(stdQueue[current]);
            current = (current + 1) % max;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(stdQueue[front]);
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(stdQueue[rear]);
    }

    public void peekPosition(String nim) {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int current = front;
        for (int i = 0; i < size; i++) {
            if (stdQueue[current].nim.equals(nim)) {
                System.out.println(stdQueue[current]);
                return;
            }
            current = (current + 1) % max;
        }
        System.out.println("Student with NIM " + nim + " not found.");
    }

    public void printStudents(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position!");
            return;
        }
        int current = (front + position) % max;
        System.out.println(stdQueue[current]);
    }
}
