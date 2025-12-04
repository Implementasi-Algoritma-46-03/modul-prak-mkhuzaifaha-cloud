import java.util.Scanner;
import java.util.ArrayList;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        //arraylist untuk nyimpen angka yang di input
        ArrayList<Integer> hasilangka = new ArrayList<Integer>();
        int angka = 0;
        //loop untuk membaca input sampai -1
        while(angka != -1) {
            angka = sc.nextInt();
            hasilangka.add(angka);
        }

        int hasil = 0;
        int hasilPertama = 0;

        //untuk menghitung angka yang diambil dari arraylist
        for (int i = 0; i < hasilangka.size(); i++){
            int banding = 0;
            //untuk membandingkan semua angka yang ada di arraylist
            for (int j = i; j < hasilangka.size(); j++){
                if (hasilangka.get(i) == hasilangka.get(j)){
                    banding++;
                }
            }
            //untuk menyimpan angka paling banyak 
            if (banding >= hasilPertama){
                hasil = hasilangka.get(i);
                hasilPertama = banding;
            }
        }
        System.out.println(hasil);
    }
}