
package adminAslab;

import static java.lang.System.exit;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    int pilih;
    char kembali;
    Scanner input = new Scanner(System.in);
    double nTulis,nCoding,nWawancara,nilai_microteaching;
        do{
            System.out.println("===SELAMAT MENCOBA=====");
            System.out.println("1. Asisten Laboratorium");
            System.out.println("2. Admin Laboratorium");
            System.out.print("Pilih : ");
            pilih=input.nextInt();
            
            switch(pilih){
                
                case 1:
                {
                      int jumlah=0;
                    String nama;
                    int nim;
                    System.out.println("ASISTEN LABORATORIUM");
                    System.out.print("Input berapa banyak data : ");
                    jumlah = input.nextInt();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("Input NIM : ");
                        nim = input.nextInt();
                        System.out.print("Input Nama : ");
                        input.nextLine();
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tulis : ");
                        nTulis = input.nextInt();
                        System.out.print("Input Nilai Coding : ");
                        nCoding = input.nextInt();
                        System.out.print("Input Nilai Wawancara : ");
                        nWawancara = input.nextInt();
                        System.out.print("Input Nilai Microteaching : ");
                        nilai_microteaching = input.nextInt();
                        Aslab pAslab = new Aslab(nama, nim, nTulis, nCoding, nWawancara, nilai_microteaching);
                        System.out.println("Nilai Rata-rata : " + pAslab.nRata);
                        if(pAslab.nRata > 85){
                            System.out.println("KETERANGAN : LOLOS");
                             }
                        else{
                            System.out.println("KETERANGAN : TIDAK LOLOS");
                           }
                    }
                }break;
                case 2:{
                   int jumlah=0;
                   String nama;
                    int nPraktek,nim;
                    System.out.println("ADMIN LABORATORIUM");
                    System.out.print("Input berapa banyak data : ");
                    jumlah = input.nextInt();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("Input NIM : ");
                        nim = input.nextInt();
                        System.out.print("Input Nama : ");
                        input.nextLine();
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tulis : ");
                        nTulis = input.nextInt();
                        System.out.print("Input Nilai Coding : ");
                        nCoding = input.nextInt();
                        System.out.print("Input Nilai Wawancara : ");
                        nWawancara = input.nextInt();
                        System.out.print("Input Nilai Tes Jaringan : ");
                        nPraktek = input.nextInt();
                        Admin pAdmin = new Admin(nama, nim, nTulis, nCoding, nWawancara, nPraktek);
                        System.out.println("Nilai Rata-rata : " + pAdmin.nRata);
                        if(pAdmin.nRata > 85){
                            System.out.println("KETERANGAN : LOLOS");
                           
                        }
                        else{
                            System.out.println("KETERANGAN : TIDAK LOLOS");
                            
                        }
                    }
                }break;
                default :
                    exit(0);
                        
            }
            
            System.out.print("Kembali ke menu? (y/n) : ");
            kembali = input.next().charAt(0);
            System.out.println("");
    }while (kembali == 'y' || kembali == 'Y');
        
    }
    
}
