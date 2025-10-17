public class MejaBelajar extends Meja {
    private int jumlahLaci;

    public MejaBelajar(String material, int panjang, int jumlahLaci) {
        super(material, panjang);
        this.jumlahLaci = jumlahLaci;
    }

    // Getter & Setter
    public int getJumlahLaci() {
        return jumlahLaci;
    }

    public void setJumlahLaci(int jumlahLaci) {
        this.jumlahLaci = jumlahLaci;
    }

    // Method tambahan
    public void bukaLaci() {
        System.out.println("Laci meja belajar dibuka.");
    }

    public void tutupLaci() {
        System.out.println("Laci meja belajar ditutup.");
    }
}
