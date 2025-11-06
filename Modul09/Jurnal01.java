import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int asli = angka;
        int jumlahFaktorial = 0;

        do {
            int digit = angka % 10;
            jumlahFaktorial += faktorial(digit);
            angka /= 10;
        } while (angka > 0);

        if (jumlahFaktorial == asli) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }

    // Fungsi untuk menghitung faktorial dari sebuah digit
    public static int faktorial(int n) {
        int hasil = 1;
        for (int i = 2; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}

