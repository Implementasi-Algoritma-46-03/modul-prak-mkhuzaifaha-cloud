import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int bulat = 0;
    for (int i = 1; i <= N; i += 2) {
        bulat += i;
    }
System.out.println(bulat);
    }
}
