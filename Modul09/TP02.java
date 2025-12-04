import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
    String kalimat = sc.nextLine();

    int jumlahVokal = 0;
    for (int i = 0; i < kalimat.length (); i++) {
        char huruf = kalimat.charAt(i);
        if (huruf == 'a'|| huruf == 'i'||huruf == 'u'|| huruf == 'e'|| huruf == 'o' ) {
            jumlahVokal++;
        }
        }
        System.out.println(jumlahVokal);
    }
}
