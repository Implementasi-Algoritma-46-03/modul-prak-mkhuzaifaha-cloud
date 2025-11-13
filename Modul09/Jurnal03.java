import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
       Scanner sc = new Scanner(System.in);
       int angka = sc.nextInt();
        int prima = 0;
        String hasil = "";
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0){ 
                prima++;
            }
            if (prima == 2 ) 
                hasil = "YA";
            else 
                hasil = "TIDAK";
        }
        System.out.println(hasil);
    }
}
