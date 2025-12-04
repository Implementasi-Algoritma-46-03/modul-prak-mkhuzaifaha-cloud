import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            
            for(int j = 1; j <= x; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

    }
}
