public class Buku_Percobaan3 {
    public static void main(String[] args) {
        
        class Buku {
            String judul, pengarang;
            int halaman, stok, harga;
    
            public Buku() {

            }

        public Buku(String jud, String pg, int hal, int stok, int har) {
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
            stok -= jml;
        }

        void restock(int jml) {
            stok += jml;
        }
    
        void gantiHarga(int hrg) {
            harga = hrg;
        }
            }

            Buku bk1 = new Buku();
        
            bk1.judul = "Today Ends Tomorrow Comes";
            bk1.pengarang = "Denanda Pratiwi";
            bk1.halaman = 198;
            bk1.stok = 13;
            bk1.harga = 71000;

            bk1.tampilInformasi();
            bk1.terjual(5);
            bk1.gantiHarga(60000);
            bk1.tampilInformasi();

            Buku BukuSaria = new Buku("Self Reward", "Maheera Ayesha", 160, 29, 59000);
            BukuSaria.terjual(11);
            BukuSaria.tampilInformasi();
    }
}