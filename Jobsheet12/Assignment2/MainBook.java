package Jobsheet12.Assignment2;

import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*****************");
            System.out.println("Library Data Book");
            System.out.println("*****************");
            System.out.println("1. Add new book");
            System.out.println("2. Get book from top");
            System.out.println("3. Peek book title from top");
            System.out.println("4. Info all books");
            System.out.println("5. Exit");
            System.out.println("*****************");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Insert new book title: ");
                    String title = scanner.nextLine();
                    bookStack.push(title);
                    break;
                case 2:
                    String removedTitle = bookStack.pop();
                    if (removedTitle != null) {
                        System.out.println("Removed book: " + removedTitle);
                    }
                    break;
                case 3:
                    String topTitle = bookStack.peek();
                    if (topTitle != null) {
                        System.out.println("Top book title: " + topTitle);
                    }
                    break;
                case 4:
                    System.out.println("All books in stack:");
                    bookStack.printStack();
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}