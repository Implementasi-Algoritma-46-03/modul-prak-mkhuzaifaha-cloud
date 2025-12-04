import java.util.Scanner;
 
public class Jurnal01 {

    public static void main(final String[] args) {
        //Scanner 
        Scanner sc = new Scanner(System.in);
       //Array untuk menyimpan nama peserta
        String[] peserta = new String[40];
        int jumlah = 0;
        //while untuk looping nama peserta biar tercetak
        while (true) {
            String nama = sc.nextLine();
            //if untuk ngestop loop
            if (nama.equals("-")) {
                break;
            }
            
            peserta[jumlah] = nama;
            jumlah++;
        }
        //for untuk nyetak nama peserta
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Bulan " + (i +1) + ": " + peserta[i]);
        }

    }
}
