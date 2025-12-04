import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
       Scanner sc = new Scanner(System.in);
       int angka = sc.nextInt();
       int real = angka;
       int jumlahfaktorial = 0;
       do { 
           int digit = angka % 10;
           jumlahfaktorial += faktorial(digit);
           angka /= 10;
       } while (angka > 0);
       if (jumlahfaktorial == real) {
           System.out.println("YA");
       } else {
           System.out.println("BUKAN");
       }
    }
       public static int faktorial(int n) {
        int hasil = 1;
        int i = 2;
        while (i <= n) {
            hasil *= i;
            i++;
        }
        return hasil;
       }
}
