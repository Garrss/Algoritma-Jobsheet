package Jobsheet7;

import java.util.Random;

public class ArraySearch {
    int data[][] = new int[2][4];
    int idx = 0;

    void add(int number) {
        if (idx < data.length * data[0].length) {
            int row = idx / data[0].length;
            int column = idx % data[0].length;
            data[row][column] = number;
            idx++;
        }
    }

    void display() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[] segSearch(int search) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] == search) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    void showPosition(int x, int row, int column) {
        if (row == -1) {
            System.out.println("Data: " + x + " is not found");
        } else {
            System.out.println("Data: " + x + " is found at position (" + row + ", " + column + ")");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        ArraySearch arraySearch = new ArraySearch();

        for (int i = 0; i < 10; i++) {
            arraySearch.add(rand.nextInt(100));
        }

        arraySearch.display();
        int search = arraySearch.data[rand.nextInt(arraySearch.data.length)][rand
                .nextInt(arraySearch.data[0].length)];
        int[] position = arraySearch.segSearch(search);
        arraySearch.showPosition(search, position[0], position[1]);

    }
}