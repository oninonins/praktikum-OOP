
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(new Penumpang("67890", "Spongebob"), 1); // Mencoba menempatkan penumpang lain di kursi yang sama
        
        
        System.out.println(gerbong.info());
    }
}