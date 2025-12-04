import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int amouba = 30 ;
        int waktu = 0;

        do{ 
            amouba *=2;
            waktu += 15;
        }while(amouba < n);

        System.out.println(waktu);
    }
}
