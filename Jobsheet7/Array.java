package Jobsheet7;

import java.util.Random;
import java.util.Scanner;

public class Array {
    int[] data = new int[5];
    int idx = 0;

    public void add(int number) {
        if (idx < data.length) {
            data[idx] = number;
            idx++;
        }
    }

    void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[smallest]) {
                    smallest = j;
                }
            }
            int temp = data[smallest];
            data[smallest] = data[i];
            data[i] = temp;
        }
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    int seqSearch(int search) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == search) {
                return i;
            }
        }
        return -1;
    }

    void showPosition(int x, int pos) {
        if (pos == -1) {
            System.out.println("Data: " + x + " is not found");
        } else {
            System.out.println("Data: " + x + " is found at position " + pos);
        }
    }

    void Biggest() {
        int max = 0;
        int pos = 0;
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                pos = i;
                max = data[i];
            }
        }
        System.out.println("Biggest number is " + max + " at position " + pos);
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Array data = new Array();
        Random rand = new Random();

        System.out.println("Input how many numbers you want: ");
        int amount = scanner.nextInt();
        data.data = new int[amount];

        for (int i = 0; i < amount; i++) {
            data.add(rand.nextInt(100));
        }

        data.display();
        data.Biggest();
        data.selectionSort();
        data.display();
        int search = data.data[rand.nextInt(data.data.length)];
        System.out.println("Search " + search);
        int position = data.seqSearch(search);
        data.showPosition(search, position);
        data.Biggest();

    }
}