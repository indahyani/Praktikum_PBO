
package method;
   
import java.util.Scanner;

public class MainTabunganMethod {
    public static void main (String[] args){
        Tabungan tabungan = new Tabungan();
        tabungan.getJumlahSaldo(2000000);
        Scanner scanInput = new Scanner (System.in);
        
        int saldoAkhir;
        int pilih;
        char kembali = 'n';
        int jumlah;
        do{
            System.out.println("Menu tabungan");
            System.out.println("1. penarikan");
            System.out.println("2. penyetoran");
            System.out.println("pilih menu");
            pilih = scanInput.nextInt();
            if (pilih == 1){
                System.out.println("Menu penarikan");
                System.out.println("Jumlah : ");
                jumlah = scanInput.nextInt();
                if (jumlah < tabungan.getJumlahSaldo()-50000) {
                saldoAkhir = tabungan.penarikanSaldo(jumlah);
                System.out.println("Transaksi Berhasil");
                System.out.println("Saldo Akhir : " + saldoAkhir);
                }else{
                    saldoAkhir = tabungan.getJumlahSaldo();
                    System.out.println("Saldo anda kurang");
                    System.out.println("Transaksi dibatalkan");
                    System.out.println(" saldo akhit : " + saldoAkhir);
                }
            }else if (pilih == 2){
                System.out.println("Menu penyetoran");
                System.out.println("Jumlah : ");
                jumlah = scanInput.nextInt();
                tabungan.setorSaldo(jumlah);
                saldoAkhir = tabungan.penarikanSaldo(jumlah);
                System.out.println("Transaksi Berhasil");
                System.out.println("Saldo Akhir : " + saldoAkhir);
                
            }else {
                        System.out.println("Input tidak sesuai");
                        }
            System.out.println("Kembali ke menu? (Y/N)");
            kembali = scanInput.next().charAt(0);
        }while (kembali=='Y'||kembali=='y');
    }
}
