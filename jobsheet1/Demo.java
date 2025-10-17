public class Demo {
    public static void main(String[] args) {
        Meja meja = new Meja("Kayu Jati", 120);
        MejaBelajar mejaBelajar = new MejaBelajar("Kayu Mahoni", 100, 3);
        Kursi kursi = new Kursi("Kursi Putar", 90);
        Lemari lemari = new Lemari(2, "Coklat");

        // Tes Meja
        meja.info();
        meja.letakkanBarang();
        meja.bersihkan();

        System.out.println();

        // Tes MejaBelajar
        mejaBelajar.info();
        mejaBelajar.bukaLaci();
        mejaBelajar.tutupLaci();

        System.out.println();

        // Tes Kursi
        kursi.info();
        kursi.duduk();
        kursi.geser();

        System.out.println();

        // Tes Lemari
        lemari.info();
        lemari.bukaPintu();
        lemari.tutupPintu();
    }
}
