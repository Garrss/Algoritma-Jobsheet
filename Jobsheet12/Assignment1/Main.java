package Jobsheet12.Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Data manipulation with Double Linked List");
            System.out.println("1. Add First");
            System.out.println("2. Add Tail");
            System.out.println("3. Add Data in nth index");
            System.out.println("4. Remove first");
            System.out.println("5. Remove Last");
            System.out.println("6. Remove data by index");
            System.out.println("7. Print");
            System.out.println("8. Search Data");
            System.out.println("9. Sort Data");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Insert data in Head position: ");
                    int data1 = scanner.nextInt();
                    dll.addFirst(data1);
                    break;
                case 2:
                    System.out.print("Insert data in Tail position: ");
                    int data2 = scanner.nextInt();
                    dll.addTail(data2);
                    break;
                case 3:
                    System.out.print("In index: ");
                    int index = scanner.nextInt();
                    System.out.print("Insert Data: ");
                    int data3 = scanner.nextInt();
                    dll.addNth(index, data3);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("In index: ");
                    int removeIndex = scanner.nextInt();
                    dll.removeNth(removeIndex);
                    break;
                case 7:
                    System.out.println("Print data");
                    dll.printList();
                    break;
                case 8:
                    System.out.print("Search data: ");
                    int searchData = scanner.nextInt();
                    int searchIndex = dll.searchData(searchData);
                    if (searchIndex != -1) {
                        System.out.println("Data " + searchData + " is in index-" + searchIndex);
                    } else {
                        System.out.println("Data " + searchData + " not found");
                    }
                    break;
                case 9:
                    System.out.println("Data sorted in descending order");
                    dll.sortDescending();
                    dll.printList();
                    break;
                case 10:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}