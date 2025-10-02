
import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
       Scanner sc = new Scanner(System.in);
        double nominalawal = sc.nextDouble();
        double nominalawal2 = sc.nextDouble();
        double nominalawal3 = sc.nextDouble();
        double ratarata = (nominalawal + nominalawal2 + nominalawal3) / 3;
        System.out.printf("Nilai rata-rata: %.2f\n", ratarata);

    }
}
