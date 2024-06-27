package Jobsheet12.Assignment4;

public class Student {
    String nim;
    String name;
    double gpa;

    public Student(String nim, String name, double gpa) {
        this.nim = nim;
        this.name = name;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("NIM : " + nim);
        System.out.println("Name : " + name);
        System.out.println("GPA : " + gpa);
    }
}