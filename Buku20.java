public class Buku20 {
    String judul, pengarang;
    int halaman, stok, harga;

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

    void gantiharga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    int hitungDiskon(int jml) {
        int diskon = 0;
        int hargaTotal = hitungHargaTotal(jml);
        if (hargaTotal >= 150000) {
            diskon = (int) (0.12 * hargaTotal);
        } else if (hargaTotal < 150000 && hargaTotal >= 75000)
            diskon = (int) (0.05 * hargaTotal);
        else
            diskon = 0;
        return diskon;
    }

    public Buku20() {

    }

    public Buku20(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
