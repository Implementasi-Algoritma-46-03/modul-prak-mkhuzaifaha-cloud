import java.util.Scanner;

public class TP03 {
    public static void rumus() {
        Scanner sc = new Scanner(System.in);
        String bangun = sc.nextLine();

        switch (bangun) {
            case "Persegi":
                int sisi = sc.nextInt();
                int luasPersegi = sisi * sisi;
                int kelilingPersegi = 4 * sisi;
                System.out.println(luasPersegi + " " + kelilingPersegi);
                break;
            case "Persegi Panjang":
                int panjang = sc.nextInt();
                int lebar = sc.nextInt();
                int luasPersegiPanjang = panjang * lebar;
                int kelilingPersegiPanjang = 2 * (panjang + lebar);
                System.out.println(luasPersegiPanjang + " " + kelilingPersegiPanjang);
                break;
            case "Segitiga":
                int alas = sc.nextInt();
                int tinggi = sc.nextInt();
                int luasSegitiga = (alas * tinggi) / 2;
                double kelilingSegitiga = alas + tinggi + Math.sqrt((alas * alas) + (tinggi * tinggi));
                System.out.println(luasSegitiga + " " + (int) Math.ceil(kelilingSegitiga));
                break;
            case "Lingkaran":
                int radius = sc.nextInt();
                double phi = 3.14;
                double r = radius / 2;
                double luasLingkaran = phi * r * r;
                double kelilingLingkaran = 2 * phi * r;
                System.out.printf("%.2f %.2f", luasLingkaran, kelilingLingkaran);

                break;
            default:
                break;
        }
    }
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        rumus();
    }
}
