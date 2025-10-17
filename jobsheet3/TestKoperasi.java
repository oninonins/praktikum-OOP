package jobsheet3;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        anggota1 donny = new anggota1("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        
        System.out.print("\nMasukkan jumlah pinjaman: ");
        int pinjam1 = sc.nextInt();
        donny.pinjam(pinjam1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman: ");
        int pinjam2 = sc.nextInt();
        donny.pinjam(pinjam2);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        int angsur1 = sc.nextInt();
        donny.angsur(angsur1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        int angsur2 = sc.nextInt();
        donny.angsur(angsur2);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        sc.close();
    }
}
