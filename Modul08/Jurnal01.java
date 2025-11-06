import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int N = sc.nextInt();

        double sisa = R;
        int hari = 0;
        do { 
            sisa /=2;
            hari +=10;

        } while (hari < N);

        System.out.printf("%.3f\n", sisa);

    }
}
