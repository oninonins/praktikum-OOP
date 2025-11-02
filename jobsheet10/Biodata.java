package jobsheet10;

public class Biodata { 
    
    private String nim;
    private String nama;
    private String jurusan;
    private String gender;
    private String alamat;
    private boolean baca;
    private boolean makan;
    private boolean tidur;

    public Biodata() {
    }

    public Biodata(String nim, String nama, String jurusan, String gender, String alamat, boolean baca, boolean makan, boolean tidur) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.gender = gender;
        this.alamat = alamat;
        this.baca = baca;
        this.makan = makan;
        this.tidur = tidur;
    }

    // Getter dan Setter (dibuat menggunakan "Insert Code" di NetBeans) [cite: 328]
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isBaca() {
        return baca;
    }

    public void setBaca(boolean baca) {
        this.baca = baca;
    }

    public boolean isMakan() {
        return makan;
    }

    public void setMakan(boolean makan) {
        this.makan = makan;
    }

    public boolean isTidur() {
        return tidur;
    }

    public void setTidur(boolean tidur) {
        this.tidur = tidur;
    }
    
    // --- JAWABAN UNTUK PERTANYAAN 2 ---
    // 
    /**
     * Override method toString() untuk menampilkan data biodata yang diformat.
     * Ini adalah perbaikan untuk pertanyaan 2.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nim: ").append(nim != null ? nim : "-").append("\n");
        sb.append("Nama: ").append(nama != null ? nama : "-").append("\n");
        sb.append("Jurusan: ").append(jurusan != null ? jurusan : "-").append("\n");
        sb.append("Gender: ").append(gender != null ? gender : "-").append("\n");
        
        sb.append("Hobi: ");
        String hobi = "";
        if (baca) hobi += "Membaca ";
        if (makan) hobi += "Makan ";
        if (tidur) hobi += "Tidur";
        if (hobi.isEmpty()) hobi = "-";
        
        sb.append(hobi.trim()).append("\n");
        
        
        sb.append("Alamat: ").append(alamat != null && !alamat.isEmpty() ? alamat : "-").append("\n");

        return sb.toString();
    }
}