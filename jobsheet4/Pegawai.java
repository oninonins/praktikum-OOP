public class Pegawai {
    private String nama;
    private String nip;


    public Pegawai(String nip, String nama) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "NIP: " + this.nip + "\n";
        return info;
    }
}
