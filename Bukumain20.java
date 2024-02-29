public class Bukumain20 {
    public static void main(String[] args) {

        Buku20 bk1 = new Buku20();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiharga(60000);
        bk1.tampilInformasi();

        Buku20 bk2 = new Buku20("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku20 bukuTegar = new Buku20("Cinta di dalam Samudra", "Muhammad Tegar Hibatulloh", 1050, 8, 40000);
        bukuTegar.terjual(3);
        bukuTegar.tampilInformasi();

        System.out.println("Harga yang terjual : " + bk1.hitungHargaTotal(5));
        System.out.println("Harga diskon : " + bk1.hitungDiskon(5));
        System.out.println("Harga bayar : " + bk1.hitungHargaTotal(5));
    }
}