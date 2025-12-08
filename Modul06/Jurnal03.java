import java.util.Scanner;

public class Jurnal03 {
    public static void tabung(double jari, double tinggi, double tinggiAir) {
      
        double a = (3.141592653589793) * (jari * jari) * tinggi;
        double b = (3.141592653589793) * (jari * jari) * tinggiAir;
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
