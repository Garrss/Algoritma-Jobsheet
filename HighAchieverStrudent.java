public class HighAchieverStrudent {
    Student list[] = new Student[5];
    int idx;

    // add method
    void add(Student std) {
        if (idx < list.length) {
            list[idx] = std;
            idx++;
        } else {
            System.out.println("The student list is already full-filled");
        }
    }

    // print method
    void print() {
        for (Student s : list) {
            s.print();
            System.out.println("=====================");
        }
    }

    // bubble sort method
    void bubblesort() {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j].gpa > list[j - 1].gpa) {

                    Student tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;

                }
            }
        }
    }
}
