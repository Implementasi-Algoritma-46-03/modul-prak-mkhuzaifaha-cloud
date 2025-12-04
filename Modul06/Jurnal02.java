import java.util.Scanner;
public class Jurnal02 {
    public static String gantiVocal(String kalimat) {
        String ganti ="";
        int panjang = kalimat.length();
        int panjang2 = panjang % 5;
        switch (panjang2) {
            case 0:
            ganti = kalimat.replaceAll("[aiueo]", "a");
                break;
            case 1:
            ganti = kalimat.replaceAll("[aiueo]", "e");
                break;
            case 2:
            ganti = kalimat.replaceAll("[aiueo]", "i");
                break;
            case 3:
            ganti = kalimat.replaceAll("[aiueo]", "o");
                break;
            case 4:
            ganti = kalimat.replaceAll("[aiueo]", "u");
                break;
            default:
                break;
        }
        return ganti;
    }    
    public static void main(final String[] args) {
       
        Scanner sc = new Scanner(System.in);

        String kalimat = sc.nextLine();
        System.out.println(gantiVocal(kalimat));
        sc.close();
    }
}
