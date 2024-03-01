import java.util.Scanner;

public class kode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] kode = new char[10];
        char[][] kota = new char[10][12];
        char kode_plat;

        String[] kota_temp = { "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA",
                "MALANG", "TEGAL" };

        for (int i = 0; i < kota.length; i++) {
            for (int j = 0; j < kota_temp[i].length(); j++) {
                kota[i][j] = kota_temp[i].charAt(j);
            }
        }

        kode[0] = 'A';
        kode[1] = 'B';
        kode[2] = 'D';
        kode[3] = 'E';
        kode[4] = 'F';
        kode[5] = 'G';
        kode[6] = 'H';
        kode[7] = 'L';
        kode[8] = 'N';
        kode[9] = 'T';

        System.out.println("CEK KOTA DARI KODE PLAT");
        System.out.print("Masukkan kode plat: ");
        kode_plat = input.next().charAt(0);

        for (int i = 0; i < kode.length; i++) {
            if (kode_plat == kode[i]) {
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
            }
        }

    }
}
