public class BarangMain {
    public static void main(String[] args) {
        Barang barang1 = new Barang("B001", "Pensil", 2000, 10);
        barang1.tampilData();
        System.out.println();

        Barang barang2 = new Barang("B002", "Buku Tulis", 5000, 20);
        barang2.tampilData();
        System.out.println();

        Barang barang3 = new Barang("B003", "Penghapus", 3000, 5);
        barang3.tampilData();
        System.out.println();
    }
}
