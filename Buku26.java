public class Buku26 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal, diskon, hargaBayar;

    public Buku26() {

    }

    public Buku26(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
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
            System.out.println(jml + " buku terjual");
            System.out.println("===============================");
        } else {
            System.out.println("Stok buku habis terjual.");
        }
        hitungHargaTotal(jml);
    }

    void HrgFinal(){
        System.out.println("=====================================");
        System.out.println("Harga setelah diskon : Rp " + hargaBayar);
        System.out.println("=====================================");
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
    
    void hitungHargaTotal(int jmlBukuTerjual){
        hargaTotal = harga + jmlBukuTerjual;
        hitungDiskon();
    }

    void hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = (int) (0.15 * hargaTotal);
        } else if (hargaTotal >= 75000 || hargaTotal < 150000) {
            diskon = (int) (0.05 * hargaTotal);
        }
        hitungHargaBayar();
    }
    void hitungHargaBayar() {
        hargaBayar = hargaTotal - diskon;
    }
}