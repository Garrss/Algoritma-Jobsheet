import java.util.Scanner;

public class Uni {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] std = { "name", "nim", "gender(L/P)", "GPA" };
        Murid[] uni = new Murid[2];
        Murid stt = new Murid();

        for (int i = 0; i < uni.length; i++) {
            uni[i] = new Murid();
            System.out.println("Insert the " + (i + 1) + " student data");
            for (int j = 0; j < std.length; j++) {
                System.out.print("Insert " + std[j] + ": ");
                String input = in.nextLine();
                switch (j) {
                    case 0:
                        uni[i].name = input;
                        break;
                    case 1:
                        uni[i].nim = input;
                        break;
                    case 2:
                        uni[i].gender = input;
                        break;
                    case 3:
                        uni[i].gpa = Double.parseDouble(input);
                        break;
                }
            }
        }

        for (int i = 0; i < uni.length; i++) {
            uni[i].print(i);
        }

        System.out.println("Average GPA is: " + stt.calculateAverage(uni));
        System.out.println("Highest GPA is: " + stt.findHighestGpa(uni));
    }
}