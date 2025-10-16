
import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Idar: ");
      int D = input.nextInt(); // Nilai Dira
        int R = input.nextInt(); // Nilai Radi
        int I = input.nextInt(); // Nilai Idar

        // Menentukan siapa yang paling tinggi nilainya
        if (D > R && D > I) {
            System.out.println("Dira");
        } else if (R > D && R > I) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
}
    }
}

