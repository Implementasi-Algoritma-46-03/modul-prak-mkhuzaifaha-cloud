import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int [][] matriks = new int[N][N];
         for (int i = 0; i < N; i++) {
              for (int j = 0; j < N; j++) {
                  matriks[i][j] = sc.nextInt();
              }
         }
            for (int i = N - 1; i >= 0; i--) {
    for (int j = 0; j < N; j++) {
        if (j == N - 1) {
            // elemen terakhir di baris -> tanpa spasi
            System.out.print(matriks[i][j]);
        } else {
            // elemen selain terakhir -> dengan spasi
            System.out.print(matriks[i][j] + " ");
        }
    }
    System.out.println();
        }
    }
}
