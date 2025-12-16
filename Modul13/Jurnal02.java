import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] barang = sc.nextLine().split(" ");
         for (int i = 1; i < n; i++) {
            String urutan = barang[i];
            int j = i -1;

            while (j >= 0 && barang[j].compareTo(urutan) > 0) {
                barang [j + 1] = barang[j];
                j--;
            }
            barang[j + 1] = urutan;
         }
         for (int i = 0; i < n; i++) {
                System.out.print(barang[i]);
                if (i < n -1) System.out.print(" ");

        }
    }
}