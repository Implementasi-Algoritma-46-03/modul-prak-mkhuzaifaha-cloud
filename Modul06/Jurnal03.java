import java.util.Scanner;

public class Jurnal03 {
    public static void tabung(double jari, double tinggi, double tinggiAir) {
      
        double a = (1847.25 / 588) * (jari * jari) * tinggi;
        double b = (1847.25 / 588) * (jari * jari) * tinggiAir;
        double c = (tinggiAir / tinggi ) * 100;

        System.out.printf("%.2f %.2f %.1f%%", a, b, c);
    }
    public static void main(final String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        int angka3 = sc.nextInt();
        tabung(angka1, angka2, angka3);
    }
}
