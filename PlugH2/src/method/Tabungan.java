
package method;
public class Tabungan {
    // ATRIBUT
    int jumlahSaldo;
  
    public int getJumlahSaldo (){
        return jumlahSaldo;
    }

    //method-method
    public void setJumlahSaldo(int jumlahSaldo) {
        this.jumlahSaldo = jumlahSaldo;
    }

    public void setorSaldo(int jumlah) {
        jumlahSaldo = jumlahSaldo + jumlah;
    }
    public int penatikanSaldo (int jumlah){
        jumlahSaldo = jumlahSaldo - jumlah;
                return jumlahSaldo;
    }

    int penarikanSaldo(int jumlah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getJumlahSaldo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
