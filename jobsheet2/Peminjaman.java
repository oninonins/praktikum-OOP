public class Peminjaman {
    String id;
    String namaMember;
    String namaGame;
    double hargaSewa;
    int lamaSewa; 

    double hitungTotalBayar() {
        return hargaSewa * lamaSewa;
    }

    void tampilkanInfo() {
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Harga Sewa per Hari: " + hargaSewa);
        System.out.println("Lama Sewa (hari): " + lamaSewa);
        System.out.println("Total Bayar: " + hitungTotalBayar());
    }
}
