
import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
    System.err.println("Masukkan Nominal Awal : ");
    int nominalawal = sc.nextInt();
    int modulan = nominalawal % 1000;
    int bagi = nominalawal / 1000;
    System.out.println(bagi);
    System.out.println(modulan);
    

    sc.close();
    }
}
