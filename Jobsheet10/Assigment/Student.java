package Jobsheet10.Assigment;

public class Student {

    String nim;
    String name;
    int classNumber;
    double gpa;

    public Student(String nim, String name, int classNumber, double gpa) {
        this.nim = nim;
        this.name = name;
        this.classNumber = classNumber;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Name: " + name + ", Class Number: " + classNumber + ", GPA: " + gpa;
    }
}
