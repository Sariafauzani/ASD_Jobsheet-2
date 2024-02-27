public class BukuMain26 {
    public static void main(String[] args) {
        
        Buku26 bk1 = new Buku26("Today Ends Tomorrow Comes", "Denanda Pratiwi", 198, 13, 71000);
        
        
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.tampilInformasi();
        
        Buku26 BukuSaria = new Buku26("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        BukuSaria.terjual(8);
        BukuSaria.tampilInformasi();

        BukuSaria.HrgFinal();
    }
}