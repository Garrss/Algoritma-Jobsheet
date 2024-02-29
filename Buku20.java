public class Buku20 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku20() {

    }

    public Buku20(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    int gantiharga(int hrg) {
        return harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    double hitungDiskon(int hrg) {
        if (hrg > 150_000) {
            return hrg * 0.12;
        } else if (hrg <= 150_000 && hrg > 75_000) {
            return hrg * 0.05;
        } else {
            return hrg;
        }
    }

    int hitungHargaBayar(int hrg, double diskon) {
        return (int) (hrg - diskon);
    }
}
