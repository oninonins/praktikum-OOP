public class Windows extends Leptop {
    private String jnsWindows;

    Windows(){
        
    }

    public Windows(String jnsWindows, String jnsBaterai, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBaterai, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsWindows = jnsWindows;
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Jenis Windows: " + jnsWindows);
    }
}
