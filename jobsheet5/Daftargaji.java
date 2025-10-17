class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
        index = 0;
    }

    public void addPegawai(Pegawai p) { 
        if (index < listPegawai.length) {
            listPegawai[index] = p;
            index++;
        } else {
            System.out.println("Daftar gaji sudah penuh.");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama() + ", Gaji: " + listPegawai[i].getGaji());
        }
    }
}