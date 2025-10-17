public class Leptop extends Komputer {
    public String jnsBaterai;

    Leptop(){
        
    }

    public Leptop(String jnsBaterai , String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;

    }

   
    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai: " + jnsBaterai);
    }


}
