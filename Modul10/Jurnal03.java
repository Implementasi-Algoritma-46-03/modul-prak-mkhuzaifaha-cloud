import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int hasil = -1; 
        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                hasil++;
                int hasil1 = hasil % 10;
                System.out.print(hasil1);
            }
            System.out.println();
        }
    }
}