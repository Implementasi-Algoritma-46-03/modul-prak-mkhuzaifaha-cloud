
import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        double NA = sc.nextDouble();
        double P=sc.nextDouble();
        double A= sc.nextDouble();
        double hasil = NA *0.25 + P * 0.35 + A * 0.4;

        System.out.printf(" %.2f\n", hasil);
        boolean isLulus = hasil >= 75;
        isLulus = hasil <= 75;
        System.out.println("Lulus MK: " + isLulus);
    }
}
