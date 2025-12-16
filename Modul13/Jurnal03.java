import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] barang = sc.nextLine().split(" ");
        String urutan = sc.nextLine();

        for (int i = 1; i < n; i++) {
            String temp = barang[i];
            int j = i - 1;
            while (j >= 0 && barang[j].compareTo(temp) > 0){
                barang[j + 1] = barang[j];
                j--;
            }
            barang[j + 1] = temp;
        }
        int kiri = 0, kanan = n -1;
        int Index = -1;

        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            int cmp = barang[tengah].compareTo(urutan);
            
            if (cmp == 0) {
                Index = tengah;
                break; 
            } else if (cmp < 0) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }
                if (Index != -1) {
                    System.out.println("Ditemukan di indeks ke-" + Index);
                } else {
                    System.out.println("Data tidak ditemukan");
                }
            }
        }
    

