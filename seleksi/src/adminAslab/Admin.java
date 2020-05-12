
package adminAslab;


public class Admin extends adminAslab implements Nilai {
   
    protected int nPraktek;
    protected double nRata;
    public Admin(String nama,int nim,double nTulis,double nCoding,double nWawancara,int nilai_praktek) {
        super(nama, nim, nTulis, nCoding, nWawancara);
        this.nPraktek = nilai_praktek;
        jumlahNilai();
    }

    @Override
    public void jumlahNilai() {
        nRata = (super.nCoding + super.nTulis + super.nWawancara + nPraktek)/4;
    }

    
}
