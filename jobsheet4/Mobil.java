public class Mobil {

    private String Merk;
    private int biaya;

    // Constructor Default
    public Mobil() {
    }

    //setter
    public void setMerk(String merk) {
        this.Merk = merk;
    }

    //getter
    public String getMerk() {
        return Merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}