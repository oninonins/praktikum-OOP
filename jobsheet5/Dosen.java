class Dosen extends Pegawai {  
    private int jumlahSKS;
    private int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat, int jumlahSKS, int TARIF_SKS) {
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
        this.TARIF_SKS = TARIF_SKS;
    }

    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}