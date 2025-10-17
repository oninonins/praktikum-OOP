package jobsheet3;

public class anggota1 {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    
    public anggota1(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; 
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method pinjam
    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    // Method angsur
    public void angsur(int jumlah) {
        if (jumlah >= (jumlahPinjaman * 0.1)) { 
            // minimal 10% dari total pinjaman
            jumlahPinjaman -= jumlah;
        } else {
            System.out.println("Maaf, angsuran minimal 10% dari jumlah pinjaman.");
        }
    }
}
