import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
       int pola = sc.nextInt();
       for (int i = 1; i <= pola; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
        System.out.println(i);       
    }
     for (int i = pola - 1; i >= 1; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
        System.out.println(i);
    }
    }
}