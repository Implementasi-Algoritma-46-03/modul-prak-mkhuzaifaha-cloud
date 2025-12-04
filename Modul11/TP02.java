import java.util.Scanner;
import java.util.Arrays;

public class TP02 {

    public static void main(final String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] angka = new int[N];
         for (int i = 0; i < N; i++) {
              angka[i] = sc.nextInt();
         }
            Arrays.sort(angka);
            for(int i = N - 1; i >= 0; i--){
                System.out.print(angka[i]);
                if (i > 0) {
                    System.out.print(" ");
                }                
            }
    }
}
