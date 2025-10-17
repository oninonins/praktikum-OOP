public class Tester {
    public static void main(String[] args) {
        // Membuat objek-objek permainan
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        // Menampilkan informasi awal
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("-------------------------");

        // Skenario: Hancurkan Barrier sampai kalah
        System.out.println("Skenario 1: Menghancurkan Barrier...");
        
        for (int i = 0; i < 12; i++) {
            System.out.println("Plant menyerang Barrier...");
            p.doDestroy(b);
            if (b.getStrength() <= 0) {
                break;
            }
        }
        
        System.out.println("\n--- Status Setelah Skenario 1 ---");
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("-------------------------");

        // Skenario 2: Hancurkan Jumping Zombie sampai kalah
        System.out.println("\nSkenario 2: Menghancurkan Jumping Zombie...");
        for (int i = 0; i < 15; i++) {
            System.out.println("Plant menyerang Jumping Zombie...");
            p.doDestroy(jz);
             if (jz.getHealth() <= 0) {
                break;
            }
        }

        System.out.println("\n--- Status Akhir ---");
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
    }
}    