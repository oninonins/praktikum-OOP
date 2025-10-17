public class MainP {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(3);

        Dosen dosen1 = new Dosen("D001", "Dr. Andi", "Jl. Merdeka 1", 12, 50000);  
        Dosen dosen2 = new Dosen("D002", "Dr. Budi", "Jl. Merdeka 2", 10, 60000);

        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);
        daftarGaji.printSemuaGaji();
    }
}