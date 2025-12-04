import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(n%24);
       System.out.println(n%56);
       if (24 % n == 0 && 56 % n== 0) {
            System.out.println(n + " Faktor dari 24 dan 56");
        }else{
            System.out.println(n + " Bukan faktor dari 24 dan 56");
    }
}
}