import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N >= 1 && N <= 100) {
            for (int i = 1; i <= N; i++) { 
                if (i % 2 == 0) {
                    System.out.println(i +" Genap");
                } else {
                    System.out.println(i +" Ganjil");
                }
            
        }
    }
}
}
