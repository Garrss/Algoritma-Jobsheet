package Jobsheet7;

public class SortMain {
    public static void main(String[] args) {
        MergeSorting mergeSorting = new MergeSorting();
        int[] data = { 5, 2, 4, 6, 1, 3 };
        System.out.println("Sorting by Merge Sort");
        System.out.println("Initial data");
        mergeSorting.printArray(data);
        mergeSorting.mergeSort(data);
        System.out.println("Sorted data");
        mergeSorting.printArray(data);

    }
}
