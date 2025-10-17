public class Sopir {
    private String nama;
    private int biaya;

    // Constructor Default
    public Sopir() {
    }

    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    //getter
    public String getNama() {
        return nama;
    }
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
