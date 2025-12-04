import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print( "Masukkan nilai Dira, Radi, dan Idar: ");
        int D = input.nextInt(); // Nilai Dira
        int R = input.nextInt(); // Nilai Radi
        int I = input.nextInt(); // Nilai Idar

        // Menentukan siapa yang paling tinggi nilainya
        if (D < R && R < I) {
            System.out.println("Dira, Radi, Idar");
        } else if (D < I && I < R) {
            System.out.println("Dira, Idar, Radi");
        } else if (R < D && D < I) {
            System.out.println("Radi, Dira, Idar");
        } else if (R < I && I < D) {
            System.out.println("Radi, Idar, Dira");
        } else if (I < D && D < R) {
            System.out.println("Idar, Dira, Radi");
        } else if (I < R && R < D) {
            System.out.println("Idar, Radi, Dira");
        } else {
            System.out.println("Nilai tidak valid atau ada nilai yang sama.");
        }
            

    }
}
