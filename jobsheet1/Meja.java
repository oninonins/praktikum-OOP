public class Meja {
    private String material;
    private int panjang;

    public Meja(String material, int panjang) {
        this.material = material;
        this.panjang = panjang;
    }

    // Getter & Setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    // Method
    public void letakkanBarang() {
        System.out.println("Barang diletakkan di atas meja.");
    }

    public void bersihkan() {
        System.out.println("Meja sedang dibersihkan.");
    }

    public void info() {
        System.out.println("Meja dengan material: " + material + ", panjang: " + panjang + " cm");
    }
}
