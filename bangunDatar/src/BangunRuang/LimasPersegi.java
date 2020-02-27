package BangunRuang;

import BangunDatar.Persegi;

public class LimasPersegi extends Persegi {
    
    public LimasPersegi(double sisi) {
        super(sisi);
    }
    
    public double volume(){
        return luas()*sisi/3;
    }
    
    public double luasPermukaan(){
        return 0;
    }
    
}
