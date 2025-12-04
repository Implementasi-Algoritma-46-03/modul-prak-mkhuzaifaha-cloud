import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] peserta = new String[N];
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            peserta[i] = sc.nextLine();
        }
        for (int i = 0; i < N; i++){
            System.out.println("Bulan " + (i + 1) + ": " + peserta[i]);
        }
    }
}
