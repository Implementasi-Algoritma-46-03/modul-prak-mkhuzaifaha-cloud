import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] C = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
       for (int i = 0; i < N; i++) {
    for (int j = 0; j < N; j++) {
        if (j == N - 1) {
            // elemen terakhir di baris -> tanpa spasi
            System.out.print(C[i][j]);
        } else {
            // elemen selain terakhir -> dengan spasi
            System.out.print(C[i][j] + " ");
        }
    }
    System.out.println();
}
    }
}


