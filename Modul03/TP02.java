
import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

       String nama = scanner.next(); 
       int jumlah = scanner.nextInt();
         int harga = scanner.nextInt();
       
       int total = harga * jumlah;
         System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah.");
         scanner.close();
    }
}
