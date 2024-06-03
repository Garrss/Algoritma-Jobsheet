package Jobsheet10.Assigment;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number of students in the queue: ");
        int max = sc.nextInt();
        Queue queue = new Queue(max);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Peek Rear");
            System.out.println("6. Peek Position");
            System.out.println("7. Print Student at Position");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = sc.next();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Class Number: ");
                    int classNumber = sc.nextInt();
                    System.out.print("Enter GPA: ");
                    double gpa = sc.nextDouble();
                    Student student = new Student(nim, name, classNumber, gpa);
                    queue.enqueue(student);
                    break;
                case 2:
                    Student removedStudent = queue.dequeue();
                    if (removedStudent != null) {
                        System.out.println("Removed Student: " + removedStudent);
                    }
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.peek();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                case 6:
                    System.out.print("Enter NIM to search: ");
                    nim = sc.next();
                    queue.peekPosition(nim);
                    break;
                case 7:
                    System.out.print("Enter position to search: ");
                    int position = sc.nextInt();
                    queue.printStudents(position);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
