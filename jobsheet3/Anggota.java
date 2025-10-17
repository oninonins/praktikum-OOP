package jobsheet3;

public class Anggota {
    private String nama; 
    private String alamat;
    private float simpanan;
    
    Anggota(String nama, String alamat, float simpanan) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = simpanan;
    }

   public void setNama (String nama) {
        this.nama = nama;
    }

    public void setAlamat (String alamat) {
        this.alamat = alamat;
    }

    String getNama () {
        return nama;
    }

    String getAlamat () {
        return alamat;
    }

    public float getSimpanan () {
        return simpanan;
    }

    void setor (float uang) {
        simpanan += uang;
    }
    void pinjam (float uang) {
        simpanan -= uang;
    }

    
}