public class Kursi {
    private String jenis;
    private int tinggi;

    public Kursi(String jenis, int tinggi) {
        this.jenis = jenis;
        this.tinggi = tinggi;
    }

    // Getter & Setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // Method
    public void duduk() {
        System.out.println("Seseorang duduk di kursi.");
    }

    public void geser() {
        System.out.println("Kursi digeser.");
    }

    public void info() {
        System.out.println("Kursi jenis: " + jenis + ", tinggi: " + tinggi + " cm");
    }
}
