import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        int n = 0;
        String nim;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda: ");
        nim = input.nextLine();

        if (nim.length() >= 2) {
            String lastTwo = nim.substring(nim.length() - 2);
            n = Integer.parseInt(lastTwo);

            if (n < 10) {
                n += 10;
            }
        }

        System.out.println("n: " + n);

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 || i == 6 || i == 10) {
                System.out.print(" * ");
            } else {
                System.out.print(i);
            }
        }
    }
}