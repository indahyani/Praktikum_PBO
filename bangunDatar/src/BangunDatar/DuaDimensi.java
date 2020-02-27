package BangunDatar;
public abstract class DuaDimensi {
    
    public double sisi,luas,keliling,rusuk,alas,depan,samping,miring;
    public double sisiKubus;
    public double panjang,lebar,tinggi;
    public double volume,luasPermukaan;
    
    //public abstract double luas();
    //public abstract double keliling();
    //public abstract double volume();
    //public abstract double luasPermukaan();
   
    public double hasilLuas(){
        return this.luas;
    }
    
    public double hasilKeliling(){
        return this.keliling;
    }
    public double hasilVolume(){
        return this.volume;
    }
    public double hasilLuasPermukaan(){
        return this.luasPermukaan;
    }
    
    
}
