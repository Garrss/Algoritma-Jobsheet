import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        HighAchieverStrudent data = new HighAchieverStrudent();
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print("Name = ");
            String name = s2.nextLine();
            System.out.print("Entrance year = ");
            int year = s1.nextInt();
            System.out.print("Age = ");
            int age = s1.nextInt();
            System.out.print("GPA = ");
            double gpa = s1.nextDouble();

            Student s = new Student(name, year, age, gpa);
            data.add(s);

            System.out.println("Unsorted student list: ");
            data.print();
            System.out.println("Data mahasiswa setelah sorting desc berdasar ipk=");
            data.bubblesort();
            data.print();

        }
    }

}
