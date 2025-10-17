public class Main {
    public static void main(String[] args) {
        RekeningBank rekeningBudi = new RekeningBank("1234567890", 500000.0);

        System.out.println("Saldo awal Budi: " + rekeningBudi.getSaldo());

        rekeningBudi.setor(200000.0);

      
        rekeningBudi.tarik(100000.0);

       
        rekeningBudi.tarik(700000.0); 

        // Mengecek saldo akhir
        System.out.println("Saldo akhir Budi: " + rekeningBudi.getSaldo());

        System.out.println("\nEnkapsulasi berhasil melindungi data saldo dari perubahan langsung.");
    }
}