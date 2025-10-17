public class Barang {
    String Kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    public Barang(String Kode, String namaBarang, int hargaDasar, float diskon) {
        this.Kode = Kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon / 100;
    }
    //harga jual = harga dasar +(diskon*harga dasar)
    int hitungHargaJual(){
        return (int) (hargaDasar + (diskon*hargaDasar));
    }

    void tampilData(){
        System.out.println("Kode Barang : " + Kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon : " + (diskon*100) + " %");
        System.out.println("Harga Jual : " + hitungHargaJual());
    }
}
