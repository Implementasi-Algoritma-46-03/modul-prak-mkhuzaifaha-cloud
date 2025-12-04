import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                total += sc.nextInt();
            }
        }

        System.out.println(total);

        sc.close();
    }
}