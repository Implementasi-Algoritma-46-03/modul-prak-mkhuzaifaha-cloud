
import java.util.Scanner;

public class Jurnal01 {
    public static void jam(String nama1, String nama2, int waktu) {
        String saat;
        int waktu2 = waktu % 24;
        if ( waktu2 <= 11){
            saat = "pagi";
        }
        else if ( waktu2 <= 14){
            saat = "siang";
        }
        else if (waktu2 <= 17){
            saat = "sore";
        }else{
            saat = "malam";
        }
        System.out.println("Halo, " + nama1 + ". Selamat "+ saat + ".");
        System.out.println("Halo, " + nama2 + ". Selamat "+ saat + ".");
    }
    public static void main(final String[] args) {
        
        String nama1, nama2;
        int waktu;
        Scanner sc = new Scanner(System.in);

        nama1 = sc.nextLine();
        nama2 = sc.nextLine();
        waktu = sc.nextInt();

        jam(nama1, nama2, waktu);
    }
}
