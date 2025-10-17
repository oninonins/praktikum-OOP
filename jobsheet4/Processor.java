public class Processor {
    private String merk;
    private double cache;

    // Constructor Default
    public Processor() {
    }

    // Constructor Berparameter
    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Setter untuk cache
    public void setCache(double cache) {
        this.cache = cache;
    }

    // Getter untuk cache
    public double getCache() {
        return cache;
    }

    // Method info
    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}