public class MainPeminjam {
    public static void main(String[] args) {
        Peminjaman peminjaman1 = new Peminjaman();
        peminjaman1.id = "P001";
        peminjaman1.namaMember = "Alice";
        peminjaman1.namaGame = "The Legend of Zelda";
        peminjaman1.hargaSewa = 5000;
        peminjaman1.lamaSewa = 3;

        Peminjaman peminjaman2 = new Peminjaman();
        peminjaman2.id = "P002";
        peminjaman2.namaMember = "Bob";
        peminjaman2.namaGame = "Super Mario Odyssey";
        peminjaman2.hargaSewa = 4000;
        peminjaman2.lamaSewa = 5;

        System.out.println("Informasi Peminjaman 1:");
        peminjaman1.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Peminjaman 2:");
        peminjaman2.tampilkanInfo();
    }
}
