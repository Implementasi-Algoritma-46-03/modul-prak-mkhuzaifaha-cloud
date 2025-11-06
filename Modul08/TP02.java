import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int bil = sc.nextInt(); 
        int hasil = 0; 

        do{
            int angka = bil % 10; 
            hasil = hasil * 10 + angka; 
            bil = bil / 10; 
        }while(bil != 0); 
        System.out.println(hasil);
    }
}
