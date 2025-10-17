public class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        // Memastikan saldo awal tidak negatif
        if (saldoAwal > 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }


    public void setor(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Setoran berhasil. Saldo baru: " + this.saldo);
        } else {
            System.out.println("Jumlah setoran harus lebih dari nol.");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= this.saldo) {
            this.saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo baru: " + this.saldo);
        } else {
            System.out.println("Penarikan gagal. Saldo tidak mencukupi atau jumlah tidak valid.");
        }
    }
}