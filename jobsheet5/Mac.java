public class Mac extends Leptop {
    private String jnsMac;

    Mac(){
        
    }

    public Mac(String jnsMac, String jnsBaterai, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBaterai, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsMac = jnsMac;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Jenis Mac: " + jnsMac);
    }
}
