package Jobsheet7;

import java.util.Scanner;

public class MainStudents {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        SearchStudents data = new SearchStudents();
        int amountStudent = 5;

        System.out.println("==================================");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("---------");
            System.out.print("NIM\t:");
            int nim = s.nextInt();
            System.out.print("Name\t:");
            String name = sl.nextLine();
            System.out.print("Age\t:");
            int age = s.nextInt();
            System.out.print("GPA\t:");
            double gpa = s.nextDouble();

            Students std = new Students(nim, name, age, gpa);
            data.add(std);
        }

        System.out.println("==================================");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("_______________________");
        System.out.println("_______________________");
        System.out.print("Search student by NIM: ");
        int Search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.FindBinarySearch(Search, 0, amountStudent - 1);

        data.showPosition(Search, position);

        data.showData(null, position);
    }
}
