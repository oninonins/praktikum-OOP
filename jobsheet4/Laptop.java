public class Laptop {
    private String merk;
    private Processor proc; 

    // Constructor Default
    public Laptop() {
    }

    // Constructor Berparameter
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    
    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Setter untuk proc
    public void setProc(Processor proc) {
        this.proc = proc;
    }
    
    // Getter untuk proc
    public Processor getProc() {
        return proc;
    }

    // Method info
    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info(); 
    }
}