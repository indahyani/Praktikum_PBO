package BangunDatar;
public class SegiTiga extends DuaDimensi{
    public SegiTiga(double alas, double tinggi, double miring){
       // super.alas=alas;
        //super.tinggi=tinggi;
        super.tinggi=tinggi;
        super.alas=alas;
        super.miring=miring;
        luas();
        keliling();
    }

   
    
    public double luas(){
        luas = (alas*tinggi)/2;
        return luas;
    }
    public double keliling(){
        keliling = alas+tinggi+miring;
        return keliling;
    }
    
}
