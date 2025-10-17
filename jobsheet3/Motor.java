package jobsheet3;

public class Motor {
    private int kecepatan = 0;   
    private boolean kontakOn = false;
    private int maxKecepatan = 100;

    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
        if (kontakOn == true && kecepatan < maxKecepatan) {
            kecepatan += 5;
        }else if (kecepatan >= maxKecepatan){
            System.out.println("Kecepatan sudah maksimal");
            
        }else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off");
        }
    }
    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off");
        }
    }
    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }

    
}