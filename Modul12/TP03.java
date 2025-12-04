import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
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
                int sum = 0;
                for (int k = 0; k < N; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        for (int i = N - 1; i >= 0; i--) {
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
