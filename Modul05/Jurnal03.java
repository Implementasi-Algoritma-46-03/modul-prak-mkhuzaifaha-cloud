
import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char O = sc.next().charAt(0);
        int B = sc.nextInt();
        switch (O) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                System.out.printf("%.7f\n", (double) A / B);
                break;
            default:
                System.out.println("Operator tidak ditemukan");
        } 
        
    }
}
