package Jobsheet6;

public class HighAchieverStudent {
    Students list[] = new Students[5];
    int idx;

    // add method
    void add(Students std) {
        if (idx < list.length) {
            list[idx] = std;
            idx++;
        } else {
            System.out.println("The student list is already full-filled");
        }
    }

    // print method
    void print() {
        for (Students s : list) {
            s.print();
            System.out.println("=====================");
        }
    }

    // bubble sort method
    void bubblesort() {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j].gpa > list[j - 1].gpa) {

                    Students tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;

                }
            }
        }
    }

    // selection sort method
    void selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].gpa < list[idxMin].gpa) {
                    idxMin = j;
                }
            }
            // Swap
            Students tmp = list[i];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }
}
