import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama hari dan bilangan bulat N
        String inputHari = scanner.nextLine().toLowerCase();
        int N = scanner.nextInt();

        int hari = 0;
        switch (inputHari) {
            case "senin":
                hari = 0;
                break;
            case "selasa":
                hari = 1;
                break;
            case "rabu":
                hari = 2;
                break;
            case "kamis":
                hari = 3;
                break;
            case "jumat":
                hari = 4;
                break;
            case "sabtu":
                hari = 5;
                break;
            case "minggu":
                hari = 6;
                break;
            default:
                System.out.println("Nama hari tidak valid.");
                return;
        }

        // Hitung hari ke-N menggunakan modulus
        int hasil = (hari + N) % 7;

        String hasilHari = "";
        switch (hasil) {
            case 0:
                hasilHari = "senin";
                break;
            case 1:
                hasilHari = "selasa";
                break;
            case 2:
                hasilHari = "rabu";
                break;
            case 3:
                hasilHari = "kamis";
                break;
            case 4:
                hasilHari = "jumat";
                break;
            case 5:
                hasilHari = "sabtu";
                break;
            case 6:
                hasilHari = "minggu";
                break;
        }

        System.out.println(hasilHari);
        scanner.close();
    }
}