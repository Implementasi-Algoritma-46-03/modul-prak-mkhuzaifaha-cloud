import java.util.Scanner;
public class TP03 {

    public static long faktorial(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * faktorial(n-1);
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
         if (N >= 1 && N <= 100) {
            long hasil = faktorial(N);
            System.out.println(hasil);
         } else {
            System.out.println("input tidak valid");

         }

         }
        
    }

