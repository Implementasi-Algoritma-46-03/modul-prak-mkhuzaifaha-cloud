import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int hasil = 0; 
        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print(hasil);
                hasil++;
                hasil = hasil % 10;                
            }
            System.out.println();
        }
    }
}