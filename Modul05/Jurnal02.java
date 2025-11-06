import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String hari = scanner.nextLine(), hariTetap = "";
        int tanggal = scanner.nextInt();
        int tanggal2 = 0;

        switch (hari) {
            case "Senin":
                tanggal2 = 0;
                break;
            case "Selasa":
                tanggal2 = 1;
                break;
            case "Rabu":
                tanggal2 = 2;
                break;
            case "Kamis":
                tanggal2 = 3;
                break;
            case "Jumat":
                tanggal2 = 4;
                break;
            case "Sabtu":
                tanggal2 = 5;
                break;
            case "Minggu":
                tanggal2 = 6;
                break;
        
            default:
                break;
        }

        int a = (tanggal + tanggal2) % 7;
        switch (a) {
            case 0:
                hariTetap = "Senin";
                break;
            case 1:
                hariTetap = "Selasa";
                break;
            case 2:
                hariTetap = "Rabu";
                break;
            case 3:
                hariTetap = "Kamis";
                break;
            case 4:
                hariTetap = "Jumat";
                break;
            case 5:
                hariTetap = "Sabtu";
                break;
            case 6:
                hariTetap = "Minggu";
                break;
        
            default:
                break;
        }
        System.out.println(hariTetap);
    }
}