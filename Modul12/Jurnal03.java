import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] spiral = new int [N][N];
        //menentukan arah 1,0 = bawah,|| 0,1 = kanan,|| -1,0 = atas,|| 0,-1 = kiri
        int[] baris = {1,0,-1,0};
        int[] kolom = {0,1,0,-1};
        int arah = 0;
        int x = 0;//baris
        int y = 0;//kolom
        for (int i = 1; i <= N * N; i++) {
            spiral [x][y] = i;
        int nx = x + baris[arah]; //baris berikutnya
        int ny = y + kolom[arah]; //kolom berikutnya
        if (nx < 0 || nx >= N || ny < 0 || ny >= N || spiral[nx][ny] != 0 ) {
            arah = (arah + 1) % 4;//ganti arah
            nx = x + baris[arah];
            ny = y + kolom[arah];
        } //pindah posisi
        x = nx;
        y = ny;
        }
        for (int k = 0; k < N; k++) {
    for (int j = 0; j < N; j++) {
        if (j == N - 1) {
            // elemen terakhir di baris -> tanpa spasi
            System.out.print(spiral[k][j]);
        } else {
            // elemen selain terakhir -> dengan spasi
            System.out.print(spiral[k][j] + " ");
        }
    }
    System.out.println();
}
    }
}
