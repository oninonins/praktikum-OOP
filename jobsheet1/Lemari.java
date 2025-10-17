public class Lemari {
    private int jumlahPintu;
    private String warna;

    public Lemari(int jumlahPintu, String warna) {
        this.jumlahPintu = jumlahPintu;
        this.warna = warna;
    }

    // Getter & Setter
    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method
    public void bukaPintu() {
        System.out.println("Pintu lemari dibuka.");
    }

    public void tutupPintu() {
        System.out.println("Pintu lemari ditutup.");
    }

    public void info() {
        System.out.println("Lemari warna " + warna + " dengan " + jumlahPintu + " pintu");
    }
}
