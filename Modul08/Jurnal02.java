import java.util.Scanner;

public class Jurnal02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah = 0;
        int total = 0;
        int risoles;

        do {
            risoles = sc.nextInt();
            total += risoles;
            jumlah++;
        } while (risoles != 0);

        jumlah--;

        double rataRata = (double) total / jumlah;
        System.out.printf("%.2f\n", rataRata);
    }
}