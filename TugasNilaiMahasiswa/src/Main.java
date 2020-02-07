import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String nama;
        int nilai[] = new int[100], max=0, min=0;
        int banyakNilai;
        float rata, total=0;

        Scanner Input = new Scanner (System.in);
        System.out.print("Nama : ");
        nama = Input.nextLine();
        System.out.print("Banyak Nilai : ");
        banyakNilai = Input.nextInt();

        for (int i=0; i<banyakNilai; i++){
            System.out.print("Nilai ke " + (i+1)+" : ");
            nilai[i] = Input.nextInt();
            if (i==0) {
                max = nilai[i];
                min = nilai[i];
            } else if (min>nilai[i]){
                min=nilai[i];
            } else if (max<nilai[i]){
                max=nilai[i]; }
//            else {
//            }

            total = total + nilai[i];
        }

        System.out.println("NiLai max = " + max);
        System.out.println("Nilai min = " + min);
        System.out.println("Rata-rata = " + total/banyakNilai );


    }
}
