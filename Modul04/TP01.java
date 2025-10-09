
import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int x = A % 6;
        if (x == 0) 
            System.out.println("kelipatan enam");
        else {
            System.out.println("bukan kelipatan enam");
        }
        sc.close();

    }
}
