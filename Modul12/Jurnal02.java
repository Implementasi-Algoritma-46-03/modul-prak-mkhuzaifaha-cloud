import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int [][] papan = new int [N][N];

       //loop papan
       boolean tictactoe = false;
       for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {   
            papan[i][j] = sc.nextInt();
            if (papan[i][j] == 0){
                tictactoe = true;
                }
            }
        }
        //loop row
            for (int i = 0; i<N; i++){
                int baris = papan[i][0];
                if (baris != 0) {
                    boolean sama = true;
                    for (int j = 1; j < N; j++){
                    if (papan[i][j] != baris){
                        sama = false;
                        break;
                    }
                }
                if (sama) {
                    System.out.println(baris == 1 ?  "O" : "X");
                    return;
                }
            }
        }
        //loop column
            for (int j = 0; j < N; j++) {
            int kolom = papan[0][j];
            if (kolom != 0) {
                boolean sama = true;
                for (int i = 1; i < N; i++){
                   if (papan[i][j] != kolom){
                        sama = false;
                        break;
                    } 
                }
                if (sama) {
                    System.out.println (kolom == 1 ? "O" : "X");
                    return;
                }
            }
        //looping diagonal 1
        int diag = papan [0][0];
            if (diag != 0){
                boolean sama = true;
                for (int i = 1; i < N; i++){
                if (papan[i][i] != diag) {
                    sama = false;
                    break;
                }
            }
            if (sama) {
                System.out.println (diag == 1 ? "O" : "X");
                return;
            }
        }
       //looping diagonal 2
        diag = papan[0][N - 1];
        if (diag != 0) {
            boolean sama = true;
            for (int i = 1; i < N; i++) {
                if (papan[i][N - 1 - i] != diag){
                    sama = false;
                    break;
                }
            }
            if (sama) {
               System.out.println (diag == 1 ? "O" : "X");
                return;
            }
        }
    }
    System.out.println("?");
}
}