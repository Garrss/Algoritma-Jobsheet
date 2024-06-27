package Jobsheet12.Assignment4;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==============================");
            System.out.println("Student Data Management System");
            System.out.println("==============================");
            System.out.println("1. Add data from head");
            System.out.println("2. Add data from tail");
            System.out.println("3. Add data in specific index");
            System.out.println("4. Remove data from head");
            System.out.println("5. Remove data from tail");
            System.out.println("6. Remove data in specific index");
            System.out.println("7. Print");
            System.out.println("8. Search by NIM");
            System.out.println("9. Sort by GPA - desc");
            System.out.println("10. Exit");
            System.out.println("==============================");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Insert NIM in head position");
                    System.out.print("NIM: ");
                    String nim1 = scanner.nextLine();
                    System.out.print("Name: ");
                    String name1 = scanner.nextLine();
                    System.out.print("GPA: ");
                    double gpa1 = scanner.nextDouble();
                    scanner.nextLine();
                    studentList.addHead(new Student(nim1, name1, gpa1));
                    break;
                case 2:
                    System.out.println("Insert NIM in tail position");
                    System.out.print("NIM: ");
                    String nim2 = scanner.nextLine();
                    System.out.print("Name: ");
                    String name2 = scanner.nextLine();
                    System.out.print("GPA: ");
                    double gpa2 = scanner.nextDouble();
                    scanner.nextLine();
                    studentList.addTail(new Student(nim2, name2, gpa2));
                    break;
                case 3:
                    System.out.println("Insert student's data node");
                    System.out.print("NIM: ");
                    String nim3 = scanner.nextLine();
                    System.out.print("Name: ");
                    String name3 = scanner.nextLine();
                    System.out.print("GPA: ");
                    double gpa3 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("In index: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    studentList.addAtIndex(index, new Student(nim3, name3, gpa3));
                    break;
                case 4:
                    studentList.removeHead();
                    break;
                case 5:
                    studentList.removeTail();
                    break;
                case 6:
                    System.out.print("In index: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine();
                    studentList.removeAtIndex(removeIndex);
                    break;
                case 7:
                    System.out.println("All data printed successfully");
                    studentList.printList();
                    break;
                case 8:
                    System.out.print("Insert NIM to be searched: ");
                    String searchNim = scanner.nextLine();
                    Node foundNode = studentList.searchByNim(searchNim);
                    if (foundNode != null) {
                        System.out.println("Data " + searchNim + " is:");
                        foundNode.data.print();
                    } else {
                        System.out.println("Data " + searchNim + " not found");
                    }
                    break;
                case 9:
                    studentList.sortDescendingByGpa();
                    System.out.println("Data sorted by GPA in descending order");
                    studentList.printList();
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