package Jobsheet7;

public class MergeSorting {
    public void mergeSort(int[] data) {

        sort(data, 0, data.length - 1);

    }

    private void merge(int data[], int left, int mid, int right) {
        int temp[] = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = mid + 1;
        int c = left;

        while (a <= mid && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = mid - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    private void sort(int[] data, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(data, left, mid);
            sort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }

    void printArray(int[] data) {
        int n = data.length;
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}