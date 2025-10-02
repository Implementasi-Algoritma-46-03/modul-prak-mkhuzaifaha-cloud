
import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int totalOrang = T+1;
        int jatah = N / totalOrang;
        int sisa = N % totalOrang;
        System.out.println(jatah);
        System.out.println(sisa);       
        scanner.close();
    }
}
