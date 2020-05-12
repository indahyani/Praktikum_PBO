/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminAslab;

/**
 *
 * @author ASUS
 */
public class Aslab extends adminAslab implements Nilai{
     protected double nilai_microteaching;
    protected double nRata;
    public Aslab(String nama,int nim,double nTulis,double nCoding,double nWawancara,double nilai_microteaching) {
        super(nama, nim, nTulis, nCoding, nWawancara);
        this.nilai_microteaching = nilai_microteaching;
        jumlahNilai();
    }

    @Override
    public void jumlahNilai() {
        nRata = (super.nCoding + super.nTulis + super.nWawancara + nilai_microteaching)/4;
    }
}
