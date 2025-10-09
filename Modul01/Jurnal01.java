import java.util.Scanner;
public class Jurnal01 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
// Felix 607062500001
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }
    }
}
