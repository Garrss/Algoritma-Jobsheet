package Jobsheet7;

public class SearchStudents {
    Students[] listStd = new Students[5];
    int idx = 0;

    public void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Students students : listStd) {
            students.display();
            System.out.println("=================================");
        }
    }

    public int FindBinarySearch(int Search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (Search == listStd[mid].nim) {
                return (mid);
            } else if (listStd[mid].nim < Search) {
                return FindBinarySearch(Search, left, mid - 1);
            } else {
                return FindBinarySearch(Search, mid + 1, right);
            }
        }
        return -1;
    }

    public int findSeqSearch(int Search) {
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == Search) {
                return i;
            }
        }
        return -1;
    }

    public void showPosition(int x, int pos) {
        if (pos == -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data :  " + x + " is not found" + pos);
        }
    }

    public void showData(String x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + listStd[pos].nim);
            System.out.println("Name \t : " + listStd[pos].name);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("IPK \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + "is not found");
        }
    }
}