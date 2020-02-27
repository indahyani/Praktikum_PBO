package BangunDatar;
public class Persegi extends DuaDimensi {
    public Persegi(double sisi){
        super.sisi=sisi;
        luas();
        keliling();
        
   }
    
    public double luas(){
        luas = sisi*sisi;
        return luas;
    }
    public double keliling(){
        keliling=4*sisi;
        return keliling;
    }
}
