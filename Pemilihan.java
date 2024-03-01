import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        String[] inputs = { "Tugas", "Kuis", "UTS", "UAS" };
        double[] value = new double[inputs.length];
        double[] require = { 0.2, 0.2, 0.3, 0.4 };
        String[] grade = { "A", "B+", "B", "C+", "C", "D", "E" };
        int[][] threshold = { { 80, 100 }, { 73, 80 }, { 65, 73 }, { 60, 65 }, { 50, 60 }, { 39, 50 }, { 0, 39 } };

        double total = 0;
        String result = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("+------------------------------+");
        for (int i = 0; i < inputs.length; i++) {
            System.out.print("Masukkan Nilai " + inputs[i] + ": ");
            value[i] = type.nextInt();

            while ((value[i] > 100 || value[i] < 0)) {
                System.out.print("Masukkan Nilai " + inputs[i] + " Dengan Benar: ");
                value[i] = type.nextInt();
            }
        }
        System.out.println("+------------------------------+");
        for (int i = 0; i < value.length; i++) {
            value[i] *= require[i];
            total += value[i];
        }

        for (int i = 0; i < grade.length; i++) {
            if (total > threshold[i][0] && total <= threshold[i][1]) {
                result = grade[i];
                break;
            }
        }
        System.out.println("Nilai Akhir: " + total);
        System.out.println("Nilai Huruf: " + result);
        System.out.println("+------------------------------+");

        if (total <= 50) {
            System.out.println("MAAF ANDA TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }

    }
}