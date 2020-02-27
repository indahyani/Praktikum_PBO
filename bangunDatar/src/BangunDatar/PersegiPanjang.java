package BangunDatar;
public class PersegiPanjang extends DuaDimensi{
    public PersegiPanjang(double panjang, double lebar, double tinggi){
        super.panjang=panjang;
        super.tinggi=tinggi;
        super.lebar=lebar;
        luas();
        keliling();
    }
    public double luas(){
        luas=panjang*lebar*tinggi;
        return luas;
    }
    public double keliling(){
        keliling= 2 * ( panjang*lebar + panjang*tinggi + lebar*tinggi);
        return keliling;
    }
}
