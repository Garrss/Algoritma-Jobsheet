package Jobsheet6;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    static Scanner s1 = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);

    public static void main(String[] args) {

        Random r = new Random(10);

        StudentList data = new StudentList();
        int n = 5;
        for (int i = 0; i < n; i++) {

            // System.out.println("Input Name: ");
            String name = UUID.randomUUID().toString();
            // System.out.println("Input Entrance Year: ");
            int year = r.nextInt(1000);
            // System.out.println("Input Age: ");
            int age = r.nextInt(1000);
            // System.out.println("Input GPA: ");
            double gpa = (Math.random() * 4.1);

            Students student = new Students(name, year, age, gpa);
            data.add(student);
        }

        System.out.println("Unsorted student list");
        data.display();

        System.out.println("Sorted Student List based on GPA using bubble sort");
        data.bubbleSort();
        data.display();

        System.out.println("Sorted Student List based on GPA using selection sort");
        data.selectionSort();
        data.display();

        System.out.println("Sorted Student List based on GPA using insertion sort");
        System.out.print("1. Ascending 2. Descending: ");
        int input = s1.nextInt();
        data.insertionSort(
                input == 1 ? true : false);
        data.display();

    }
}