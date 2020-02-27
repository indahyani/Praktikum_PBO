package BangunRuang;
import BangunDatar.Persegi;
import BangunDatar.DuaDimensi;

public class Kubus extends Persegi{

    public Kubus(double sisiKubus) {
        super(sisiKubus);
        luas();
        volume();
        luasPermukaan();
    }
    
    public double luas(){
        luas=sisiKubus*sisiKubus;
        return luas;
    }
    public double volume(){
       
        return luas*sisiKubus;
    }
    public double luasPermukaan(){
        return 6*luas;
    }
//    public double luas(){
//        return 0;
//    }
//    public double keliling(){
//        return 0;
//    }
    

    
}
