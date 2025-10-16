import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputHari = scanner.nextLine().toLowerCase();
        int N = scanner.nextInt();

        int hari = 0;
        switch (inputHari) {
            case "Senin":
                hari = 1;
                break;
            case "Selasa":
                hari = 2;
                break;
            case "Rabu":
                hari = 3;
                break;
            case "Kamis":
                hari = 4;
                break;
            case "Jumat":
                hari = 5;
                break;
            case "Sabtu":
                hari = 6;
                break;
            case "Minggu":
                hari = 7;
                break;
        }

        int hasil = (hari + N) % 7;
 
        String hasilHari = "";
        switch (hasil) {
            case 1:
                hasilHari = "Senin";
                break;
            case 2:
                hasilHari = "Selasa";
                break;
            case 3:
                hasilHari = "Rabu";
                break;
            case 4:
                hasilHari = "Kamis";
                break;
            case 5:
                hasilHari = "Jum'at";
                break;
            case 6:
                hasilHari = "Sabtu";
                break;
            case 7:
                hasilHari = "Minggu";
                break;
        }

        System.out.println(hasilHari.toLowerCase());
        scanner.close();
    }
}
