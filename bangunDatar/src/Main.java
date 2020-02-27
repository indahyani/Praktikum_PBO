import java.util.Scanner;
import static javafx.application.Platform.exit;
import BangunDatar.*;
import BangunRuang.Kubus;
public class Main {
    public static void main(String[] args) {
       Scanner tampung =new Scanner(System.in);
       double sisi,panjang,lebar,tinggi,alas,depan,samping,miring;
       char kembali;
        
 
       do{
            int pilih;
        
        System.out.println("MENGHITUNG BANGUN DATAR DAN BANGUN RUANG");
        System.out.println("MENU : ");
        System.out.println("1.Bangun Datar");
        System.out.println("2.Bangun Ruang");
        System.out.print("Pilih menu : ");
        pilih=tampung.nextInt();
        
        switch(pilih){
            case 1:{
                char lagi;
                int menu1;
                do{
                System.out.println("MENU BANGUN DATAR");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.print("Pilih menu : ");
                menu1=tampung.nextInt();
                
                switch(menu1){
                    case 1:{
                        System.out.println("====HITUNG LUAS DAN KELILING PERSEGI======");
                        System.out.print("Panjang Sisi = ");
                        sisi=tampung.nextDouble();
        
                        DuaDimensi tempat= new Persegi(sisi);
                        System.out.println("Luas Persegi = " + tempat.hasilLuas());
                        System.out.println("Keliling Persegi = " + tempat.hasilKeliling());
                    }break;
                    case 2:{
                        System.out.println("====HITUNG LUAS DAN KELILING PERSEGI PANJANG=====");
                        System.out.print("Panjang = ");
                        panjang=tampung.nextDouble();
                        System.out.print("Lebar = ");
                        lebar=tampung.nextDouble();
                        System.out.print("Tinggi = ");
                        tinggi=tampung.nextDouble();
                        DuaDimensi tempat1 = new PersegiPanjang(panjang,lebar,tinggi);
                        System.out.println("LuasPersegi Panjang = " + tempat1.hasilLuas());
                        System.out.println("Keliling Persegi Panjang" + tempat1.hasilKeliling());
                    }break;
                    
                    case 3:{
                        System.out.println("====HITUNG LUAS DAN KELILING SEGITIGA=====");
                        System.out.println("==========SEGITIGA========");
                        System.out.print("Sisi depan = ");
                        depan=tampung.nextDouble();
                        System.out.print("Sisi Miring = ");
                        miring=tampung.nextDouble();
                        System.out.print("Sisi Samping = ");
                        samping=tampung.nextDouble(); 
                        DuaDimensi tempat2 = new SegiTiga(depan,samping,miring);
                        System.out.println("Luas Segitiga = " + tempat2.hasilLuas());
                        System.out.println("Keliling Segitiga " + tempat2.hasilKeliling());
                       
                    }break;
                    default:
                     exit();
                        
                }
                
                    System.out.print("Pilih Bangun Datar lagi? (y/n) = ");
                    lagi=tampung.next().charAt(0);
                }while(lagi=='y'||lagi=='Y');
                
            }break;
            case 2:{
                char menu2;
               do{
                   char balik;
                   int menu3;
                   
                    System.out.println("=======MENU BANGUN RUANG=========");
                    System.out.println("1. Kubus");
                    System.out.println("2. Limas Persegi");
                    System.out.println("3. Balok");
                    System.out.println("4. Limar Persegi Panjang");
                    System.out.println("5. Prisma Segitiga");
                    System.out.println("6. Limas Segitiga");
                    System.out.print("Pilih menu = ");
                    menu3=tampung.nextInt();
                    
                    switch(menu3){
                        case 1:{
                            System.out.println("========KUBUS=========");
                            System.out.print("Sisi = ");
                            sisi=tampung.nextDouble();
                            DuaDimensi tempat3 = new Kubus(sisi);
                            System.out.println("Volume Kubus = "+ tempat3.hasilVolume());
                            System.out.println("Luas Permukaan = "+ tempat3.hasilLuasPermukaan());
                            
                        }break;
                          case 2:{
                            System.out.println("=====LIMAS PERSEGI====");
                            
                        }break;
                          case 3:{
                            System.out.println("=====BALOK====");
                            
                        }break;
                          case 4:{
                            System.out.println("=====LIMAS BALOK====");
                            
                        }break;
                          case 5:{
                            System.out.println("=====PRISMA SEGITIGA====");
                            
                        }break;
                          case 6:{
                            System.out.println("=====LIMAS SEGITIGA====");
                            
                        }break;
                        default:
                        exit();
                        
                    }
                            
                   
                   System.out.print("Kembali ke meniu Bangun Ruang (y/n) = ");
                   menu2=tampung.next().charAt(0);
               }while(menu2=='y'||menu2=='Y');
            }break;
            default:
                exit();
        }
      
         System.out.print("Kembali ke meniu Utama?(y/n) : ");
         kembali=tampung.next().charAt(0);
        }while(kembali=='y' || kembali=='Y');
    
        
        
    }
    
    
    
}
